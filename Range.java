  import java.util.NoSuchElementException;
public class Range implements IntegerSequence{
  private int start,end,current;
  public Range(int start,  int end){
     this.start=start;
     this.end=end;
     this.current=start;
   }
  public void reset(){
    current=start
  }
  public int length(){
  int length=end-start+1;
  return length;
  }
  public boolean hasNext(){
  return current!=end; }

  //@throws NoSuchElementException
  public int next(){
  if (! hasNext()) {
  throw new NoSuchElementException();
}
  else{
    current=current+1
  } return current-1;
}

}
