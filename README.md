MiniJSON for Java
========

_A minimal JSON builder - parser in Java._


Synopsis
---

MiniJSON is a simple Java library for generating / parsing JSON.
It provides a simple and yet flexible API.



Getting Started
---

If you use Maven, you can (locally) build and install the *minijson* library using standard Maven goals. 
(If you don't use Maven, then there is an ant script under `nomaven/scripts`.)
Otherwise, you can add, in your project, the following dependency:

  	<dependency>
      <groupId>org.aerysoft.minijson</groupId>
      <artifactId>minijson-core</artifactId>
      <version>0.9.1</version>
  	</dependency>


High Level API Design
---

(TBD)



API
---

Please refer to [the Project wiki pages](https://github.com/harrywye/minijson/wiki/_pages) or [the online API Docs](http://www.minijson.org/repo/apidocs/).



Notes on the Use of JDK7
---

`MiniJSON` uses some of the JDK7 features such as "Switch with string values", "Multi-catch block", "Diamond operator", and "Try with resources", etc.
If you need to use an earlier version of JDK, then you may have to check out the source code and modify some parts.
You can easily change the JDK version in the main POM file or nomaven ant script. (Look for "1.7" if you are not familiar with Maven or Ant.)


