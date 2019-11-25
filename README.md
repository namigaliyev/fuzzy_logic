# Fuzzy Logic

It was done with jfuzzylogic which is a Java library.

Link of the library: https://github.com/pcingola/jFuzzyLogic

Within the scope of the project, fuzzification was made for 3 inputs and 1 output.
The limit values and membership functions of the inputs are shown below.

### Input
#### 1.NumberOfConvenience
```
FUZZIFY NumberOfConvenience
    TERM ALONE := (0,1)(2,0);
    TERM SPARSE := (1,0)(2,1)(3,0);
    TERM VERY_FEW := (2,0)(3,1)(4,0);
    TERM FEW := (3,0)(4,1)(5,0);
    TERM MEDIUM := (4,0)(5,1)(6,0);
    TERM MANY := (5,0)(6,1)(7,0);
    TERM TOO_MANY := (6,0)(7,1)(8,0);
    TERM ENOUGH := (7,0)(8,1)(9,0);
    TERM EVERYWHERE := (8,0)(9,1)(11,0);
END_FUZZIFY
```
![NumberOfConvenience](https://github.com/nalyv/fuzzy/blob/master/Assignment1/image/image1.png)
#### 2.Age
```
FUZZIFY Age
    TERM NEW := (0,0)(4,1)(8,0);
    TERM ALMOST_NEW := (4,0)(8,1)(12,0);
    TERM NOT_NEW := (8,0)(12,1)(16,0);
    TERM MEDIUM := (12,0)(16,1)(20,0);
    TERM LESS_OLD := (16,0)(20,1)(24,0);
    TERM OLD := (20,0)(24,1)(28,0);
    TERM VERY_USED := (24,0)(28,1)(32,0);
    TERM VERY_OLD := (28,0)(32,1)(36,0);
    TERM ANTIQUE := (32,0)(36,1)(45,0);
END_FUZZIFY
```
![Age](https://github.com/nalyv/fuzzy/blob/master/Assignment1/image/image2.png)
#### 3.MRTDistance
```
FUZZIFY MRTDistance
    TERM ALONGSIDE := (0,0)(400,1)(800,0);
    TERM NEARBY := (400,0)(800,1)(1200,0);
    TERM VERY_CLOSE := (800,0)(1200,1)(1650,0);
    TERM NEAR := (1200,0)(1650,1)(2200,0);
    TERM LESS_DISTANCE := (1650,0)(2200,1)(2750,0);
    TERM MEDIUM := (2200,0)(2750,1)(3300,0);
    TERM FAR := (2750,0)(3300,1)(3850,0);
    TERM TOO_FAR := (3300,0)(3850,1)(4300,0);
    TERM OUTLYING := (3850,0)(4300,1)(4850,0);
END_FUZZIFY
```
![MRTDistance](https://github.com/nalyv/fuzzy/blob/master/Assignment1/image/image3.png)

### Output
#### 1.HousePrice
```
DEFUZZIFY HousePrice
    TERM VERY_CHEAP := (10,0)(18,1)(26,0);
    TERM CHEAP := (18,0)(26,1)(34,0);
    TERM NORMAL := (26,0)(34,1)(42,0);
    TERM LESS_EXPENSIVE := (34,0)(42,1)(50,0);
    TERM EXPENSIVE := (42,0)(50,1)(58,0);
    TERM VERY_EXPENSIVE := (50,0)(58,1)(66,0);

    METHOD : COG;
    DEFAULT := 50;
END_DEFUZZIFY
```
![traffic volume](https://github.com/nalyv/fuzzy/blob/master/Assignment1/image/image4.png)

COG technique was used for defuzzification. The  Center  of  Gravity  (COG)  method  is  one  of  the  most  popular  
defuzzification techniques  of  fuzzy  mathematics.

-------
Absolute error rate found 12%.
-------
