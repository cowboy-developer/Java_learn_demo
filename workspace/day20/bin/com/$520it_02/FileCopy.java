// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   FileCopy.java

package com.$520it_02;

import java.io.*;

public class FileCopy
{

	public FileCopy()
	{
	}

	public static void main(String args[])
		throws Exception
	{
		byByteStream("c:/360cse_official.exe", "c:/1.exe");
	}

	private static void byCharStream(String src, String dest)
	{
		Reader reader;
		Writer writer;
		reader = null;
		writer = null;
		try
		{
			reader = new FileReader(src);
			writer = new FileWriter(dest);
			int a = 10 / 0;
			char buf[] = new char[1024];
			int len;
			while ((len = reader.read(buf)) != -1) 
				writer.write(buf, 0, len);
		}
		catch (Exception e)
		{
			throw new RuntimeException(e);
		}
		break MISSING_BLOCK_LABEL_154;
		Exception exception;
		exception;
		try
		{
			if (reader != null)
				reader.close();
		}
		catch (Exception e)
		{
			throw new RuntimeException(e);
		}
		break MISSING_BLOCK_LABEL_128;
		Exception exception1;
		exception1;
		try
		{
			if (writer != null)
				writer.close();
		}
		catch (Exception e)
		{
			throw new RuntimeException(e);
		}
		throw exception1;
		try
		{
			if (writer != null)
				writer.close();
		}
		catch (Exception e)
		{
			throw new RuntimeException(e);
		}
		throw exception;
		try
		{
			if (reader != null)
				reader.close();
		}
		catch (Exception e)
		{
			throw new RuntimeException(e);
		}
		break MISSING_BLOCK_LABEL_205;
		exception1;
		try
		{
			if (writer != null)
				writer.close();
		}
		catch (Exception e)
		{
			throw new RuntimeException(e);
		}
		throw exception1;
		try
		{
			if (writer != null)
				writer.close();
		}
		catch (Exception e)
		{
			throw new RuntimeException(e);
		}
		return;
	}

	private static void byByteStream(String src, String dest)
	{
		Exception exception;
		exception = null;
		Object obj = null;
		InputStream is = new FileInputStream(src);
		OutputStream out = new FileOutputStream(dest);
		byte buf[] = new byte[1024];
		int len;
		while ((len = is.read(buf)) != -1) 
			out.write(buf, 0, len);
		if (out != null)
			out.close();
		break MISSING_BLOCK_LABEL_84;
		exception;
		if (out != null)
			out.close();
		throw exception;
		if (is != null)
			is.close();
		break MISSING_BLOCK_LABEL_161;
		Exception exception1;
		exception1;
		if (exception == null)
			exception = exception1;
		else
		if (exception != exception1)
			exception.addSuppressed(exception1);
		if (is != null)
			is.close();
		throw exception;
		exception1;
		if (exception == null)
			exception = exception1;
		else
		if (exception != exception1)
			exception.addSuppressed(exception1);
		throw exception;
		Exception e;
		e;
		throw new RuntimeException(e);
	}
}
