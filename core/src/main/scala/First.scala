import org.joda.time.DateTime


object First extends App {
  val dt = new DateTime(2023, 3, 14, 10, 30, 0)
  // add 1 day to a date
  val now = DateTime.now()
  val tomorrow = dt.plusDays(1)
  // subtract 2 hours from a time
  val twoHoursAgo = dt.minusHours(2)
  // compare two dates
  val isBefore = dt.isBefore(DateTime.parse("2023-03-14T00:00:00"))
  // format a date as a string
  val formatted = dt.toString("yyyy-MM-dd HH:mm:ss")
  println("Format of date and time : "+ formatted)
  println("Is date before given time : " + isBefore)
  println("Showing time two hours ago : " + twoHoursAgo)
  println("Showing tommorrow date : " + tomorrow)
  println("Showing current date and time : " + now)
}