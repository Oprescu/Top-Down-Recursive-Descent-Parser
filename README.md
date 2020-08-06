# Top-Down-Recursive-Descent-Parser

This is a manually constructed recursive descent parser that
can verify syntax.

**Usage**: Java TinyParse [filename]


# Grammar
The EBNF Grammar used in this parser is: 
>Program -> MethodDecl MethodDecl*  
>Type -> INT | REAL |STRING  
>MethodDecl -> Type [MAIN] Id '(' FormalParams ')' Block  
>FormalParams -> [FormalParam ( ',' FormalParam )* ]  
>FormalParam -> Type Id  

# Example Execution 
**Using the input code:**
```
INT MAIN F1() 
BEGIN
INT A;
A := F2();
END

INT F2()
BEGIN
	INT X; 
	INT Y; 
	INT Z;
	Z := 4;
	X := 4;
	Y := 5;
  	IF (X==Y) BEGIN Z := X*X - Y*Y + X *Y -X +Y/X/X; END ELSE
  	 BEGIN Z := X*X - Y*Y + X *Y -X +Y/X/X; END 
	IF(X!=Y)
	BEGIN
		IF(X+Y == 5)
		BEGIN
		 Z := X+Y-4;
		 Y := Z-2;
		 RETURN 0;
		END
		WRITE(Z,"XKOUTPUT");
	END ELSE BEGIN 
		INT A;
	END
	RETURN 1;
END
```

**We get the following output from the parser:**

![alt text](https://i.imgur.com/ABRG2fL.png)
