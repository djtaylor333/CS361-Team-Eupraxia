JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = server.java sensor.java car.java road.java

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class
