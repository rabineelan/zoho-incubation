class Adv_elements {
    
    void myArray(int a[], int n){
        int p[] = new int[n], my=1;
        for(int i=0; i<n; i++){
            my = my * a[i];
        }
        for(int i=0; i<n; i++){
            p[i] = my / a[i];
            System.out.print(p[i] + " ");
        }
    }
    
    public static void main(String[] args){
        Adv_elements my = new Adv_elements();
      int a[] = {1,2,3,4,5};
      int n = a.length;
      my.myArray(a,n);
    }
}
