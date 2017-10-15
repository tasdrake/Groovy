class Gigasecond {

    static def from(start) {

      Date date = new Date(millis.getTime() + 1000000000000);
      SimpleDateFormat sdf = new SimpleDateFormat("EEEE,MMMM d,yyyy h:mm a");
      return sdf.format(date);
    }

}
