package com.pattern.Proxy.demo3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

public class Proxy {

	public static Object newProxyInstance(Class iface, InvocationHandler handler) {
		String sep = "\r\n";
		
		String methodStr = "";
		Method[] methods = iface.getMethods();
		for(Method m : methods){
			methodStr += 
			"	@Override"+sep+
			"	public void " +m.getName()+"(){"+sep+
			"		try{"+sep+
			"			Method md = "+iface.getName()+".class.getMethod(\""+m.getName()+"\");"+sep+
			"			h.invoke(this,md);"+sep+
			"		}catch(Throwable e)"+sep+
			"		{	"+sep+
			"			e.printStackTrace();"+sep+
			"		}"+sep+
			"	}";
		}
		
		String commonStr = 
	    "package DynamicProxy;"+sep+
	    "import java.lang.reflect.Method;"+sep+
	    "public class TimeProxy implements "+iface.getName()+"{"+sep+
	    "	DynamicProxy.InvocationHandler h;"+sep+
	    "	public TimeProxy(InvocationHandler handler)"+sep+
	    "	{ h = handler;}"+sep+
	    	methodStr+sep+
	    "}"
	    ;
		//src/DynamicProxy
		String s = "src/DynamicProxy";
		//String s = "file/DynamicProxy";
		
		String filePath = "D:/workspace/design/"+s+"/TimeProxy.java";
		try {
			File file = new File(filePath);
			FileWriter writer = new FileWriter(file);
			writer.write(commonStr);
			writer.flush();
			writer.close();
			
			JavaCompiler complier = ToolProvider.getSystemJavaCompiler();
			StandardJavaFileManager manager = complier.getStandardFileManager(null, null, null);
			Iterable<? extends JavaFileObject> units = manager.getJavaFileObjects(filePath);
			CompilationTask task = complier.getTask(null, manager, null, null, null, units);
			task.call();
			manager.close();
			
			URL url = new URL("file:/"+System.getProperty("user.dir")+"/src");
			URL[] urls = new URL[]{url};
			URLClassLoader loader = new URLClassLoader(urls);
			
			Class c = loader.loadClass("DynamicProxy.TimeProxy");
			System.out.println(c);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
}
