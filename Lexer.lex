import java_cup.runtime.*;
%%

%type Symbol
%function yylex()
%class Scanner
%eofval{ return new Symbol(SymbolTable.EOF);
%eofval}
%state COMMENT

IDENTIFIER = [a-zA-Z][a-zA-Z0-9]*
NUMBER = [0-9]+(\.[0-9]+)?
%%
<YYINITIAL> "/**" {yybegin(COMMENT);}
<YYINITIAL> ":=" {return new Symbol(SymbolTable.EQUALS);}
<YYINITIAL> \"[^\"]*\" {return new Symbol(SymbolTable.QString);}
<YYINITIAL> "=="|"!=" {return new Symbol(SymbolTable.BooleanExpression);}
<YYINITIAL> STRING|INT|REAL {return new Symbol(SymbolTable.TYPE);}
<YYINITIAL> WRITE {return new Symbol(SymbolTable.WRITE);}
<YYINITIAL> MAIN {return new Symbol(SymbolTable.MAIN);}
<YYINITIAL> RETURN {return new Symbol(SymbolTable.RETURN);}
<YYINITIAL> READ {return new Symbol(SymbolTable.READ);}
<YYINITIAL> BEGIN {return new Symbol(SymbolTable.BEGIN);}
<YYINITIAL> END {return new Symbol(SymbolTable.END);}
<YYINITIAL> IF {return new Symbol(SymbolTable.IF);}
<YYINITIAL> ELSE {return new Symbol(SymbolTable.ELSE);}
<YYINITIAL> ";" {return new Symbol(SymbolTable.SEMICOLON);}
<YYINITIAL> "," {return new Symbol(SymbolTable.COMMA);}
<YYINITIAL> "(" {return new Symbol(SymbolTable.LPAREN);}
<YYINITIAL> ")" {return new Symbol(SymbolTable.RPAREN);}
<YYINITIAL> "+" {return new Symbol(SymbolTable.PLUS); }
<YYINITIAL> "-" {return new Symbol(SymbolTable.MINUS); }
<YYINITIAL> "*" {return new Symbol(SymbolTable.TIMES); }
<YYINITIAL> "/" {return new Symbol(SymbolTable.DIVIDE); }
<YYINITIAL> "." {return new Symbol(SymbolTable.DOT); }
<YYINITIAL> {IDENTIFIER} {return new Symbol(SymbolTable.ID);}
<YYINITIAL> {NUMBER} { return new Symbol(SymbolTable.NUMBER);}  
<YYINITIAL> \r|\n|\t|" " {}
<YYINITIAL> . {return new Symbol(SymbolTable.error);}

<COMMENT>"**/" {yybegin(YYINITIAL);}
<COMMENT>[\r\n \t] {}
<COMMENT>. {}

