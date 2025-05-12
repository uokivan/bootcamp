public class newArray {
  private String[] staffs;

  public void add(Staff newStaff) {
    Staff[] newStaffs = new Staff[this.staffs.length + 1];
    for (int i = 0; i < this.staffs.length; i++) {
      newStaffs[i] = staffs[i];
    }
    newStaffs[newStaffs.length - 1] = newStaff;
    this.staffs = newStaffs;
  }

}
