# Kotlin presentation
This is a presentation about Kotlin that runs well inside IntelliJ.

# Chapters:
## 01 - Syntax and getting a feeling for the language
- var/val, top level functions
- Classes - default constructor och syntax
- Properties - getter setter - inga get/set innan det behövs

## 02 - nullability
- Follow the document
- String <- String? not ok.


## 03 - lambdas
- function type syntax, lambdas is first-class citizen
- supply function as argument
- obtain function as result
- crazy lambdas


## 04 - Extension functions
- usefulness for math: vector
- usefulness for structures: my own (not very useful) structure


## 05 - extension functions
- you can add extensions to functions
- extension functions also work with generics

## 06 - sealed interface
- compile-time exhaustive search through if/when clause 
- language - native method of implementing results from API



# Pros and cons highlights of the language (compared to Java)

## Pros highlights
- harsh-ish compiler weeding out simple mistakes:
  - bad re-assignments
  - null pointer exceptions
  - some threading issues
- GREAT function type syntax makes you use function style all the time to great benefit of everyone
- more natural coding philosophy than Java such as top level declarations
- is a jvm language! Real smooth interoperability with Java!
- everything else I said in this presentation



## Cons
- some claim-to-fame features are actually not great
  - kotlin native (haven't tried this but internet says so)
  - kotlin builder pattern (great to use but not easy to implement right)
- not huge adoption outside android and hipster backend developers
- a little counter-intuitive to learn coming from Java
- perhaps too many cool features?
- libraries written to work with Java sometimes need you to break best practices in kotlin (such as using val)



Try it for yourself
https://play.kotlinlang.org/

Or learn in this curated interactive guide designed for Java developers
https://play.kotlinlang.org/koans/