package Collections;

public  class MyArrayList {
    private  String[] array = new String[10];
    int size = 0;
     public  void aad(String element){
         array[size] = element;
         size++;
         if(size == array.length){
             String[] newArray = new String[array.length * 2];
             for(int i = 0; i < newArray.length;i++){
                 newArray[i] = array[i];
             }
             array = newArray;
         }

     }
     public void remove(int index){
         for(int i = index;i < size -1;i++){
             array[i] = array[i +1];
         }
         array[size] = null;
         size--;
     }
     public void remove(String elem){
         for(int i = 0; i < size;i++){
             if(elem.equals(array[i])){
                 remove(i);
                 return;
             }
         }
     }
public String get(int index){
         return array[index];
}
    public int getSize() {
        return size;
    }
}
