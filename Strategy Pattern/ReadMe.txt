Strategy Pattern is a very useful pattern.It allows us to interchange alghoritms at runtime.

Problem:
For example if we have a Duck class with different methods(algorithms).We want to create different 
types of Ducks with different overrode methods.To achieve this we could create other classes which 
would inherit from the Duck superclass.The problem is that we would end up with more child classes
which would have the same overriden methods which means lots of duplications and if we want a lot of 
different types of Ducks then we would have to create a new class for each different Duck and by 
doing this we will end up with a class explosion too.

Solution:
We create the needed behaviors by creating interfaces which will contain a specific method and we 
create classes which implement the interface.These classes will implement different types of the
methods declared in the interface.Then we inject these behaviors in the Duck class.We create private 
variables in the Duck class which have the type of the behaviors and we initialize these in the 
constructor.When we call the Ducks methods we will call the declared behaviors method which matches 
the method we wanted to call.The conclusion is that we can interchange these methods at runtime by 
passing different types of behaviors when we call the Ducks constructor.