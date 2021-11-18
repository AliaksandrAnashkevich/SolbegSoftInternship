#Lambdas
Implement data processing functionality:

Should be:
* Find persons who have a particular position and restrict persons by age
* Display found people to console with personal information (name , age)
* Display working hours (this logic applies to Position enum)

Example:

```java
/**
 *  Find persons with DEVELOPMENT position and older than 20 y.o.
 */
        List<Person> personList = Arrays.asList(
                new Person("Petr", "petr@solbeg.com", Position.DEVELOPER, 24),
                new Person("Evgeniy", "evg@mail.com", Position.MANAGER, 18),
                new Person("Anna", "anna@google.com", Position.DEVELOPER, 21),
                new Person("Mark", "thanos@titanov.net", Position.HR, 33)
        );
        PersonProcessor processor = new PersonProcessor();
/**
 *  Your implementation
 */
```
>##Output
> Petr - 24 years old
> 
> Anna - 21 years old
> 
> Working hours - 9PM - 6AM
> 

##Requirements
* Use functional interfaces (nice to have own implementation)
* Implement at least one method in enum
* Separate logic (Find, Display)
* (OPTIONAL) Write unit tests

