public class CenturyFromYear {
  public static int getCentury(int year) {
    if (year <= 0) {
      return 1;
    } else {
      int century = (year - 1) / 100 + 1;
      return century;
    }
  }



	public static void main(String[] args) {
		
		System.out.println(getCentury(1834));
		// TODO Auto-generated method stub

	}

}
