import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  int currentIndex;
  int []data;

  /*Construct the sequence by copying values from the other array into the data array*/
  public ArraySequence(int [] other){
    currentIndex=0;
    data = new int[other.length];
    for (int i=0;i<other.length;i++){
      data[i]=other[i];
    }
  }public ArraySequence(IntegerSequence otherseq){
    currentIndex=0;
    data = new int[otherseq.length()];
    int i=0;
    otherseq.reset();
    while (otherseq.hasNext()){
      data[i]=otherseq.next();
      i++;
    }
    otherseq.reset();
  }
  public boolean hasNext(){
    return currentIndex<data.length;
  }
  public void reset(){
    currentIndex=0;
  }
    public int next(){
      if (! hasNext()) {
      throw new NoSuchElementException();
    }
    else{
      currentIndex=currentIndex+1;
    }
     return data[currentIndex-1];
    }
    public int length(){
      return data.length;
    }
}
