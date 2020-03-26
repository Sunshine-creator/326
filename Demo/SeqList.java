package Demo;
public class SeqList<E> {
    private E[] data = (E[]) new Object[100];
    private  int size;
    public void add(E elem){
        data[size] = elem;
        size++;
    }
    public E get(int index){
        return data[index];
    }
    public static void main(String[] args) {
        SeqList <String> seqList = new SeqList <>();
        seqList.add("加油");
        seqList.add("中国");
        seqList.add("HELLO");
        String str = seqList.get(0);
        System.out.println(str);                          //
        SeqList<Animal> animal = new SeqList<>();
         animal.add(new Animal());
         animal.add(new Animal());
         Animal animal1 = animal.get(0);
         SeqList<Integer> seqList1 = new SeqList <>();   //装箱
         seqList1.add(new Integer(10));
    }
}
