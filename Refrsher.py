#Refresher for all concepts in python

print("Hello World!")
x = "Dhruv" #assigning variable
x = ["apple", "banana", "cherry"] #list
x = ("apple", "banana", "cherry") #tuple
x = {"apple", "banana", "cherry"} #set
x = {"name" : "John", "age" : 36} #dictionary

x=3
typecast = str(x) #typecasting int to string
age = 36
print("My name is John, and I am {}".format(age)) #format string

a = 200
b = 33
if b > a:
  print("b is greater than a")
else: #use elif for else-if
  print("b is not greater than a")

#list creation
thislist = list(("apple", "banana", "cherry")) # note the double round-brackets 
print(thislist)

#List comprehension
#newlist = [expression for item in iterable if condition == True] 
fruits = ("apple", "banana", "cherry")
newlist = [x for x in fruits if x != "apple"]
newlist = [x for x in range(10) if x < 5]
newlist = [x if x != "banana" else "orange" for x in fruits]

#To add something to a tuple convert it to list first
#When creating a tuple with only one item, remember to include a comma after the item, otherwise it will not be identified as a tuple.
x = ("apple", "banana", "cherry")
y = list(x)
y[1] = "kiwi"
x = tuple(y)

#Dictionaries
thisdict = {
  "brand": "Ford",
  "model": "Mustang",
  "year": 1964
}
print(thisdict["brand"])

#Lambda function
# lambda arguments : expression
def myfunc(n):
  return lambda a : a * n
#Classes
#for classes refer the supermarket repository (without database)

#Format the price to be displayed as a number with two decimals:
txt = "The price is {:.2f} dollars"
