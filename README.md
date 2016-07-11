# scala-sezpoz

Attempt to run Java annotation processors on Scala class files

http://stackoverflow.com/questions/38291192/run-java-source-annotation-processing-on-scala-built-class-files

Mainly it needs to run 

`javac -cp ".../.m2/repository/net/java/sezpoz/sezpoz/1.11/sezpoz-1.11.jar:."  -proc:only -processor  net.java.sezpoz.impl.Indexer6 -verbose   mypackage.ScalaUseMyAnnotations`

on the Scala class files once built

It has gradle and sbt build files but nothing works as yet
