class Leap {
    def year
    Leap(Integer year) {
        this.year = year;
    }

    def isLeapYear() {
        if (this.year % 4 != 0) {
          return false;
        } else if (this.year % 4 == 0 && this.year % 100 != 0) {
          return true;
        } else if (this.year % 100 == 0 && this.year % 400 != 0) {
          return false;
        } else if (this.year % 400 == 0) {
          return true;
        }
    }

}
