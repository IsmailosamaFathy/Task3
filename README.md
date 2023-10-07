# Task3
# IDE :     Elclipse
# This home task 3 solved using java langauge
##This task is responsible of Show Characteristics of vechicle.


# All what you have to do is to run the program

Input : no entery data 

Output : Printing characteristics of each vechicle.



1- At first I have created super class called engine with constructor  and sub class CombustionEngine, ElectricEngine and HybridEngine .
Each attribute in the super class is constant in order to be not be changed or data be manipulated by other function in the same package acctidently by other users.  
2- I created another class manufacture with all required constructor , getter & all attributes also constant as these data like birth certifcate to the car .
3- Also , created abstract super class vechicle wich has two attributes of class engine & manufacture that is privated not accessed out the class with abstract method name ShowCharacteristics
that it will be implemented in the sub classes & two getters to read data of the two attributes
5- Creating three sub class  ICEV, BEV, HybridV implementing the abstracted method ShowCharacteristics()
6- In the Main class we make array it is elements of type vehicle each element will be initialize using three sub class 
7- Finally we make a for loop to print the output
8- How will we pass the initiation data using constructor ? 
each class has its own constructor .In the diagram below showing how data is passed 
for Manufacture 
ICEV, BEV, HybridV >>>>>>> vechicle >>>>>>> Manufacture.

for Engine : 
ICEV, BEV, HybridV >>>>>>> vechicle >>>>>>> Engine.
