
Shortly the Composite Pattern is about being able to operate with collection of objects in the same way as with concrete single objects.
In this project the Plant class is an interface which declares some methods.
The Field and Forest implementing the Plant class in the Composite file are Composites which mean that they are a collection of Plant types(there can be only 1 Plant in a collection too).
The classes in the Simple file are concrete Plants, not collections and they also implement the Plant class.
In the Main class i created different combinations of collections and concrete Plants showing that using the Composite Pattern we can treat collections of objects in the same way as single objects,and here i mean that we can call different methods on these collections exactly in the same way as they were concrete objects.
The way these composites work is that when we call a method on them they will call that method on every component which they have.
