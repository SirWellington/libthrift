libthrift
=========

A fork of the Java library for Thrift with renamed package names.

Why is this necessary?
=============================
This repository exists to mitigate the effects of "Jar Hell." 
This happens when two libraries depend on different versions of another library, 
are sitting in the same ClassPath, and those different versions are binary-incompatible. 
This results in a Runtime Exception of java.lang.IncompatibleClassChangeError.

Workaround
======================
The easiest workaroung, if the common library is Open Source (which Thrift is), then
to take the source code and rename the package name for each version. This will require
that the client code be changed to use the new package names. This allows two different
versions of the same library to exist on the classpath.

For example, if I wanted to reference org.apache.thrift.TBase, I would instead change to
org.apache.thrift9.TBase were I to want version 9.
