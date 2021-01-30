  public static void main(String[] args) {

    replicationNum();

  }

    public static void replicationNum() {
        int[] n = {1,1,2,2,3,3,4,4,5,6,6,7,7};
        aSingleNumber(n);
    }

  public static void aSingleNumber(int[] n) {

    for (int i = 0; i < n.length; i++) {

      int a = 0;

      int j = 0;

      for (; j < n.length; j++) {

        if(n[i] == n[j]){

          a++;

        }

        if(a == 2){

          break;

        }

      }

      if(j == n.length) {

        System.out.println(n[i]);

      }

    }

  }

}