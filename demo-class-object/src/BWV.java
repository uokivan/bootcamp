public class BWV {
  private Integer number;
  private String key;
  private boolean isMajor;
  private String keyFull;
  private String inst;


  public BWV(int number, String inst, String key) {
    this.number = number;
    this.inst = inst;
    this.key = key;

    if ((int) key.charAt(0) >= 65 && (int) key.charAt(0) <= 71) {
      this.isMajor = true;
      this.keyFull = key.concat(" Major");
    } else {
      this.isMajor = false;
      this.keyFull = key.concat(" minor");
    }
  }



  public static void main(String[] args) {

    int bwvStart = 995;
    int bwvEnd = 1012;

    BWV[] bwv = new BWV[bwvEnd - bwvStart + 1];

    for (int i = 0; i < bwv.length; i++) {

      String key;

      switch (i) {
        case 0:
          key = "g";
          break;
        case 1:
          key = "e";
          break;
        case 2:
          key = "c";
          break;
        case 3:
          key = "Eb";
          break;
        case 4:
          key = "c";
          break;
        case 5:
          key = "g";
          break;
        case 6:
          key = "g";
          break;
        case 7:
          key = "b";
          break;
        case 8:
          key = "a";
          break;
        case 9:
          key = "d";
          break;
        case 10:
          key = "c";
          break;
        case 11:
          key = "E";
          break;
        case 12:
          key = "G";
          break;
        case 13:
          key = "d";
          break;
        case 14:
          key = "C";
          break;
        case 15:
          key = "Eb";
          break;
        case 16:
          key = "c";
          break;
        case 17:
          key = "D";
          break;
        default:
          key = "";
          System.out.println("Fail");
      }

      if (i < 6) {
        bwv[i] = new BWV(i + bwvStart, "Suite for Lute", key);
      } else if (i >= 6 && i < 12) {
        bwv[i] =
            new BWV(i + bwvStart, "Sonatas and Partitas for solo Violin", key);
      } else {
        bwv[i] = new BWV(i + bwvStart, "Suite for Cello", key);
      }
    }

    for (int i = 0; i < bwv.length; i++ ){
      System.out.println("BWV " + bwv[i].number + " " + bwv[i].inst + " in " + bwv[i].keyFull);
    }

  }
}
