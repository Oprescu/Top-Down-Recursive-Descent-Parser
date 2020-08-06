
import java.io.*;

public class TinyParser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public TinyParser() {super();}

  /** Constructor which sets the default scanner. */
  public TinyParser(java_cup.runtime.Scanner s) {super(s);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\051\000\002\005\004\000\002\002\004\000\002\005" +
    "\003\000\002\004\010\000\002\004\011\000\002\004\007" +
    "\000\002\004\010\000\002\006\005\000\002\006\003\000" +
    "\002\007\004\000\002\010\005\000\002\012\004\000\002" +
    "\012\003\000\002\011\003\000\002\011\003\000\002\011" +
    "\003\000\002\011\003\000\002\011\003\000\002\011\003" +
    "\000\002\011\003\000\002\013\005\000\002\013\004\000" +
    "\002\014\006\000\002\014\006\000\002\015\005\000\002" +
    "\016\007\000\002\016\011\000\002\017\011\000\002\020" +
    "\011\000\002\021\005\000\002\021\005\000\002\021\005" +
    "\000\002\021\005\000\002\021\005\000\002\021\006\000" +
    "\002\021\005\000\002\021\003\000\002\021\003\000\002" +
    "\022\005\000\002\023\005\000\002\023\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\137\000\004\014\006\001\002\000\004\002\141\001" +
    "\002\000\006\002\uffff\014\006\001\002\000\006\016\010" +
    "\030\007\001\002\000\004\010\132\001\002\000\004\030" +
    "\011\001\002\000\004\010\012\001\002\000\006\011\013" +
    "\014\016\001\002\000\004\021\022\001\002\000\006\011" +
    "\ufff9\026\127\001\002\000\004\011\020\001\002\000\004" +
    "\030\017\001\002\000\006\011\ufff8\026\ufff8\001\002\000" +
    "\004\021\022\001\002\000\006\002\ufffd\014\ufffd\001\002" +
    "\000\020\014\034\015\037\017\041\020\025\021\022\023" +
    "\032\030\036\001\002\000\024\014\ufff3\015\ufff3\017\ufff3" +
    "\020\ufff3\021\ufff3\022\ufff3\023\ufff3\024\ufff3\030\ufff3\001" +
    "\002\000\024\014\ufff1\015\ufff1\017\ufff1\020\ufff1\021\ufff1" +
    "\022\ufff1\023\ufff1\024\ufff1\030\ufff1\001\002\000\004\010" +
    "\121\001\002\000\024\014\ufff4\015\ufff4\017\ufff4\020\ufff4" +
    "\021\ufff4\022\ufff4\023\ufff4\024\ufff4\030\ufff4\001\002\000" +
    "\024\014\ufff0\015\ufff0\017\ufff0\020\ufff0\021\ufff0\022\ufff0" +
    "\023\ufff0\024\ufff0\030\ufff0\001\002\000\024\014\ufff2\015" +
    "\ufff2\017\ufff2\020\ufff2\021\ufff2\022\ufff2\023\ufff2\024\ufff2" +
    "\030\ufff2\001\002\000\004\022\120\001\002\000\004\010" +
    "\107\001\002\000\022\014\034\015\037\017\041\020\025" +
    "\021\022\022\ufff5\023\032\030\036\001\002\000\004\030" +
    "\103\001\002\000\024\014\uffef\015\uffef\017\uffef\020\uffef" +
    "\021\uffef\022\uffef\023\uffef\024\uffef\030\uffef\001\002\000" +
    "\004\012\076\001\002\000\004\010\070\001\002\000\024" +
    "\014\uffee\015\uffee\017\uffee\020\uffee\021\uffee\022\uffee\023" +
    "\uffee\024\uffee\030\uffee\001\002\000\010\010\045\030\042" +
    "\031\043\001\002\000\024\004\uffdc\005\uffdc\006\uffdc\007" +
    "\uffdc\010\061\011\uffdc\013\uffdc\025\uffdc\026\uffdc\001\002" +
    "\000\022\004\uffdd\005\uffdd\006\uffdd\007\uffdd\011\uffdd\013" +
    "\uffdd\025\uffdd\026\uffdd\001\002\000\014\004\050\005\051" +
    "\006\053\007\052\025\060\001\002\000\010\010\045\030" +
    "\042\031\043\001\002\000\014\004\050\005\051\006\053" +
    "\007\052\011\047\001\002\000\022\004\uffe0\005\uffe0\006" +
    "\uffe0\007\uffe0\011\uffe0\013\uffe0\025\uffe0\026\uffe0\001\002" +
    "\000\010\010\045\030\042\031\043\001\002\000\010\010" +
    "\045\030\042\031\043\001\002\000\010\010\045\030\042" +
    "\031\043\001\002\000\010\010\045\030\042\031\043\001" +
    "\002\000\022\004\uffe2\005\uffe2\006\uffe2\007\uffe2\011\uffe2" +
    "\013\uffe2\025\uffe2\026\uffe2\001\002\000\022\004\uffe1\005" +
    "\uffe1\006\uffe1\007\uffe1\011\uffe1\013\uffe1\025\uffe1\026\uffe1" +
    "\001\002\000\022\004\uffe3\005\uffe3\006\053\007\052\011" +
    "\uffe3\013\uffe3\025\uffe3\026\uffe3\001\002\000\022\004\uffe4" +
    "\005\uffe4\006\053\007\052\011\uffe4\013\uffe4\025\uffe4\026" +
    "\uffe4\001\002\000\024\014\uffe9\015\uffe9\017\uffe9\020\uffe9" +
    "\021\uffe9\022\uffe9\023\uffe9\024\uffe9\030\uffe9\001\002\000" +
    "\012\010\045\011\062\030\042\031\043\001\002\000\022" +
    "\004\uffde\005\uffde\006\uffde\007\uffde\011\uffde\013\uffde\025" +
    "\uffde\026\uffde\001\002\000\016\004\050\005\051\006\053" +
    "\007\052\011\uffd9\026\066\001\002\000\004\011\065\001" +
    "\002\000\022\004\uffdf\005\uffdf\006\uffdf\007\uffdf\011\uffdf" +
    "\013\uffdf\025\uffdf\026\uffdf\001\002\000\010\010\045\030" +
    "\042\031\043\001\002\000\014\004\050\005\051\006\053" +
    "\007\052\011\uffda\001\002\000\010\010\045\030\042\031" +
    "\043\001\002\000\014\004\050\005\051\006\053\007\052" +
    "\026\072\001\002\000\004\032\073\001\002\000\004\011" +
    "\074\001\002\000\004\025\075\001\002\000\024\014\uffe6" +
    "\015\uffe6\017\uffe6\020\uffe6\021\uffe6\022\uffe6\023\uffe6\024" +
    "\uffe6\030\uffe6\001\002\000\012\010\045\030\042\031\043" +
    "\032\100\001\002\000\014\004\050\005\051\006\053\007" +
    "\052\025\102\001\002\000\004\025\101\001\002\000\024" +
    "\014\uffea\015\uffea\017\uffea\020\uffea\021\uffea\022\uffea\023" +
    "\uffea\024\uffea\030\uffea\001\002\000\024\014\uffeb\015\uffeb" +
    "\017\uffeb\020\uffeb\021\uffeb\022\uffeb\023\uffeb\024\uffeb\030" +
    "\uffeb\001\002\000\006\012\076\025\105\001\002\000\024" +
    "\014\uffec\015\uffec\017\uffec\020\uffec\021\uffec\022\uffec\023" +
    "\uffec\024\uffec\030\uffec\001\002\000\024\014\uffed\015\uffed" +
    "\017\uffed\020\uffed\021\uffed\022\uffed\023\uffed\024\uffed\030" +
    "\uffed\001\002\000\004\022\ufff6\001\002\000\010\010\045" +
    "\030\042\031\043\001\002\000\014\004\050\005\051\006" +
    "\053\007\052\013\116\001\002\000\004\011\112\001\002" +
    "\000\020\014\034\015\037\017\041\020\025\021\022\023" +
    "\032\030\036\001\002\000\024\014\uffe8\015\uffe8\017\uffe8" +
    "\020\uffe8\021\uffe8\022\uffe8\023\uffe8\024\114\030\uffe8\001" +
    "\002\000\020\014\034\015\037\017\041\020\025\021\022" +
    "\023\032\030\036\001\002\000\024\014\uffe7\015\uffe7\017" +
    "\uffe7\020\uffe7\021\uffe7\022\uffe7\023\uffe7\024\uffe7\030\uffe7" +
    "\001\002\000\010\010\045\030\042\031\043\001\002\000" +
    "\014\004\050\005\051\006\053\007\052\011\uffdb\001\002" +
    "\000\026\002\ufff7\014\ufff7\015\ufff7\017\ufff7\020\ufff7\021" +
    "\ufff7\022\ufff7\023\ufff7\024\ufff7\030\ufff7\001\002\000\004" +
    "\030\122\001\002\000\004\026\123\001\002\000\004\032" +
    "\124\001\002\000\004\011\125\001\002\000\004\025\126" +
    "\001\002\000\024\014\uffe5\015\uffe5\017\uffe5\020\uffe5\021" +
    "\uffe5\022\uffe5\023\uffe5\024\uffe5\030\uffe5\001\002\000\004" +
    "\014\016\001\002\000\004\011\ufffa\001\002\000\006\002" +
    "\ufffb\014\ufffb\001\002\000\006\011\133\014\016\001\002" +
    "\000\004\021\022\001\002\000\004\011\135\001\002\000" +
    "\004\021\022\001\002\000\006\002\ufffe\014\ufffe\001\002" +
    "\000\006\002\ufffc\014\ufffc\001\002\000\004\002\001\001" +
    "\002\000\004\002\000\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\137\000\006\004\004\005\003\001\001\000\002\001" +
    "\001\000\006\004\004\005\137\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\006\006\014\007\013\001\001\000\004\010\130\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\010\020\001\001\000\002\001\001" +
    "\000\024\010\025\011\032\012\030\013\022\014\027\015" +
    "\023\016\026\017\034\020\037\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\024\010\025\011\032\012\105\013\022\014" +
    "\027\015\023\016\026\017\034\020\037\001\001\000\004" +
    "\014\103\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\021\043\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\021\045\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\021\056\001\001\000\004\021\055\001\001\000" +
    "\004\021\054\001\001\000\004\021\053\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\006\021\062\023\063\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\021\066\001\001\000\002\001\001" +
    "\000\004\021\070\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\021\076\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\006\021\107\022\110\001\001\000\002\001\001\000\002" +
    "\001\001\000\022\010\025\011\112\013\022\014\027\015" +
    "\023\016\026\017\034\020\037\001\001\000\002\001\001" +
    "\000\022\010\025\011\114\013\022\014\027\015\023\016" +
    "\026\017\034\020\037\001\001\000\002\001\001\000\004" +
    "\021\116\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\006\006" +
    "\127\007\013\001\001\000\002\001\001\000\002\001\001" +
    "\000\006\006\133\007\013\001\001\000\004\010\136\001" +
    "\001\000\002\001\001\000\004\010\135\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$TinyParser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$TinyParser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$TinyParser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$TinyParser$actions {
  private final TinyParser parser;

  /** Constructor */
  CUP$TinyParser$actions(TinyParser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$TinyParser$do_action(
    int                        CUP$TinyParser$act_num,
    java_cup.runtime.lr_parser CUP$TinyParser$parser,
    java.util.Stack            CUP$TinyParser$stack,
    int                        CUP$TinyParser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$TinyParser$result;

      /* select the action based on the action number */
      switch (CUP$TinyParser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // ActualParams ::= Expression 
            {
              Integer RESULT = null;

              CUP$TinyParser$result = new java_cup.runtime.Symbol(17/*ActualParams*/, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-0)).right, RESULT);
            }
          return CUP$TinyParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // ActualParams ::= Expression COMMA Expression 
            {
              Integer RESULT = null;

              CUP$TinyParser$result = new java_cup.runtime.Symbol(17/*ActualParams*/, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-0)).right, RESULT);
            }
          return CUP$TinyParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // BoolComparison ::= Expression BooleanExpression Expression 
            {
              Integer RESULT = null;

              CUP$TinyParser$result = new java_cup.runtime.Symbol(16/*BoolComparison*/, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-0)).right, RESULT);
            }
          return CUP$TinyParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // Expression ::= ID 
            {
              Integer RESULT = null;

              CUP$TinyParser$result = new java_cup.runtime.Symbol(15/*Expression*/, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-0)).right, RESULT);
            }
          return CUP$TinyParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // Expression ::= NUMBER 
            {
              Integer RESULT = null;

              CUP$TinyParser$result = new java_cup.runtime.Symbol(15/*Expression*/, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-0)).right, RESULT);
            }
          return CUP$TinyParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // Expression ::= ID LPAREN RPAREN 
            {
              Integer RESULT = null;

              CUP$TinyParser$result = new java_cup.runtime.Symbol(15/*Expression*/, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-0)).right, RESULT);
            }
          return CUP$TinyParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // Expression ::= ID LPAREN ActualParams RPAREN 
            {
              Integer RESULT = null;

              CUP$TinyParser$result = new java_cup.runtime.Symbol(15/*Expression*/, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-3)).left, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-0)).right, RESULT);
            }
          return CUP$TinyParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // Expression ::= LPAREN Expression RPAREN 
            {
              Integer RESULT = null;

              CUP$TinyParser$result = new java_cup.runtime.Symbol(15/*Expression*/, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-0)).right, RESULT);
            }
          return CUP$TinyParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // Expression ::= Expression DIVIDE Expression 
            {
              Integer RESULT = null;

              CUP$TinyParser$result = new java_cup.runtime.Symbol(15/*Expression*/, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-0)).right, RESULT);
            }
          return CUP$TinyParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // Expression ::= Expression TIMES Expression 
            {
              Integer RESULT = null;

              CUP$TinyParser$result = new java_cup.runtime.Symbol(15/*Expression*/, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-0)).right, RESULT);
            }
          return CUP$TinyParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // Expression ::= Expression MINUS Expression 
            {
              Integer RESULT = null;

              CUP$TinyParser$result = new java_cup.runtime.Symbol(15/*Expression*/, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-0)).right, RESULT);
            }
          return CUP$TinyParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // Expression ::= Expression PLUS Expression 
            {
              Integer RESULT = null;

              CUP$TinyParser$result = new java_cup.runtime.Symbol(15/*Expression*/, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-0)).right, RESULT);
            }
          return CUP$TinyParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // ReadStmt ::= READ LPAREN ID COMMA QString RPAREN SEMICOLON 
            {
              Integer RESULT = null;

              CUP$TinyParser$result = new java_cup.runtime.Symbol(14/*ReadStmt*/, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-6)).left, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-0)).right, RESULT);
            }
          return CUP$TinyParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // WriteStmt ::= WRITE LPAREN Expression COMMA QString RPAREN SEMICOLON 
            {
              Integer RESULT = null;

              CUP$TinyParser$result = new java_cup.runtime.Symbol(13/*WriteStmt*/, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-6)).left, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-0)).right, RESULT);
            }
          return CUP$TinyParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // IfStmt ::= IF LPAREN BoolComparison RPAREN Statement ELSE Statement 
            {
              Integer RESULT = null;

              CUP$TinyParser$result = new java_cup.runtime.Symbol(12/*IfStmt*/, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-6)).left, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-0)).right, RESULT);
            }
          return CUP$TinyParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // IfStmt ::= IF LPAREN BoolComparison RPAREN Statement 
            {
              Integer RESULT = null;

              CUP$TinyParser$result = new java_cup.runtime.Symbol(12/*IfStmt*/, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-4)).left, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-0)).right, RESULT);
            }
          return CUP$TinyParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // ReturnStmt ::= RETURN Expression SEMICOLON 
            {
              Integer RESULT = null;

              CUP$TinyParser$result = new java_cup.runtime.Symbol(11/*ReturnStmt*/, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-0)).right, RESULT);
            }
          return CUP$TinyParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // AssignStmt ::= ID EQUALS QString SEMICOLON 
            {
              Integer RESULT = null;

              CUP$TinyParser$result = new java_cup.runtime.Symbol(10/*AssignStmt*/, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-3)).left, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-0)).right, RESULT);
            }
          return CUP$TinyParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // AssignStmt ::= ID EQUALS Expression SEMICOLON 
            {
              Integer RESULT = null;

              CUP$TinyParser$result = new java_cup.runtime.Symbol(10/*AssignStmt*/, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-3)).left, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-0)).right, RESULT);
            }
          return CUP$TinyParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // LocalVarDecl ::= TYPE AssignStmt 
            {
              Integer RESULT = null;

              CUP$TinyParser$result = new java_cup.runtime.Symbol(9/*LocalVarDecl*/, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-1)).left, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-0)).right, RESULT);
            }
          return CUP$TinyParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // LocalVarDecl ::= TYPE ID SEMICOLON 
            {
              Integer RESULT = null;

              CUP$TinyParser$result = new java_cup.runtime.Symbol(9/*LocalVarDecl*/, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-0)).right, RESULT);
            }
          return CUP$TinyParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // Statement ::= ReadStmt 
            {
              Integer RESULT = null;

              CUP$TinyParser$result = new java_cup.runtime.Symbol(7/*Statement*/, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-0)).right, RESULT);
            }
          return CUP$TinyParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // Statement ::= WriteStmt 
            {
              Integer RESULT = null;

              CUP$TinyParser$result = new java_cup.runtime.Symbol(7/*Statement*/, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-0)).right, RESULT);
            }
          return CUP$TinyParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // Statement ::= IfStmt 
            {
              Integer RESULT = null;

              CUP$TinyParser$result = new java_cup.runtime.Symbol(7/*Statement*/, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-0)).right, RESULT);
            }
          return CUP$TinyParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // Statement ::= ReturnStmt 
            {
              Integer RESULT = null;

              CUP$TinyParser$result = new java_cup.runtime.Symbol(7/*Statement*/, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-0)).right, RESULT);
            }
          return CUP$TinyParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // Statement ::= AssignStmt 
            {
              Integer RESULT = null;

              CUP$TinyParser$result = new java_cup.runtime.Symbol(7/*Statement*/, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-0)).right, RESULT);
            }
          return CUP$TinyParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // Statement ::= LocalVarDecl 
            {
              Integer RESULT = null;

              CUP$TinyParser$result = new java_cup.runtime.Symbol(7/*Statement*/, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-0)).right, RESULT);
            }
          return CUP$TinyParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // Statement ::= Block 
            {
              Integer RESULT = null;

              CUP$TinyParser$result = new java_cup.runtime.Symbol(7/*Statement*/, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-0)).right, RESULT);
            }
          return CUP$TinyParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // Statements ::= Statement 
            {
              Integer RESULT = null;

              CUP$TinyParser$result = new java_cup.runtime.Symbol(8/*Statements*/, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-0)).right, RESULT);
            }
          return CUP$TinyParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // Statements ::= Statement Statements 
            {
              Integer RESULT = null;

              CUP$TinyParser$result = new java_cup.runtime.Symbol(8/*Statements*/, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-1)).left, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-0)).right, RESULT);
            }
          return CUP$TinyParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // Block ::= BEGIN Statements END 
            {
              Integer RESULT = null;

              CUP$TinyParser$result = new java_cup.runtime.Symbol(6/*Block*/, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-0)).right, RESULT);
            }
          return CUP$TinyParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // FormalParam ::= TYPE ID 
            {
              Integer RESULT = null;

              CUP$TinyParser$result = new java_cup.runtime.Symbol(5/*FormalParam*/, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-1)).left, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-0)).right, RESULT);
            }
          return CUP$TinyParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // FormalParams ::= FormalParam 
            {
              Integer RESULT = null;

              CUP$TinyParser$result = new java_cup.runtime.Symbol(4/*FormalParams*/, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-0)).right, RESULT);
            }
          return CUP$TinyParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // FormalParams ::= FormalParam COMMA FormalParams 
            {
              Integer RESULT = null;

              CUP$TinyParser$result = new java_cup.runtime.Symbol(4/*FormalParams*/, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-0)).right, RESULT);
            }
          return CUP$TinyParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // MethodDecl ::= TYPE MAIN ID LPAREN RPAREN Block 
            {
              Integer RESULT = null;

              CUP$TinyParser$result = new java_cup.runtime.Symbol(2/*MethodDecl*/, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-5)).left, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-0)).right, RESULT);
            }
          return CUP$TinyParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // MethodDecl ::= TYPE ID LPAREN RPAREN Block 
            {
              Integer RESULT = null;

              CUP$TinyParser$result = new java_cup.runtime.Symbol(2/*MethodDecl*/, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-4)).left, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-0)).right, RESULT);
            }
          return CUP$TinyParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // MethodDecl ::= TYPE MAIN ID LPAREN FormalParams RPAREN Block 
            {
              Integer RESULT = null;

              CUP$TinyParser$result = new java_cup.runtime.Symbol(2/*MethodDecl*/, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-6)).left, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-0)).right, RESULT);
            }
          return CUP$TinyParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // MethodDecl ::= TYPE ID LPAREN FormalParams RPAREN Block 
            {
              Integer RESULT = null;

              CUP$TinyParser$result = new java_cup.runtime.Symbol(2/*MethodDecl*/, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-5)).left, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-0)).right, RESULT);
            }
          return CUP$TinyParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // MethodDecls ::= MethodDecl 
            {
              Integer RESULT = null;
		 RESULT = 1; 
              CUP$TinyParser$result = new java_cup.runtime.Symbol(3/*MethodDecls*/, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-0)).right, RESULT);
            }
          return CUP$TinyParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= MethodDecls EOF 
            {
              Object RESULT = null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-1)).right;
		Integer start_val = (Integer)((java_cup.runtime.Symbol) CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-1)).value;
		RESULT = start_val;
              CUP$TinyParser$result = new java_cup.runtime.Symbol(0/*$START*/, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-1)).left, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-0)).right, RESULT);
            }
          /* ACCEPT */
          CUP$TinyParser$parser.done_parsing();
          return CUP$TinyParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // MethodDecls ::= MethodDecl MethodDecls 
            {
              Integer RESULT = null;
		int eleft = ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-0)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-0)).right;
		Integer e = (Integer)((java_cup.runtime.Symbol) CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-0)).value;
		 RESULT = e + 1; 
              CUP$TinyParser$result = new java_cup.runtime.Symbol(3/*MethodDecls*/, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-1)).left, ((java_cup.runtime.Symbol)CUP$TinyParser$stack.elementAt(CUP$TinyParser$top-0)).right, RESULT);
            }
          return CUP$TinyParser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

