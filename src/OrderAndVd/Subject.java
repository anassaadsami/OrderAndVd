package OrderAndVd;
/*
 *  any class want to notify another class (Observers) must 
 *  implements this interface
 */
 interface Subject {
	 public void add(Observer obs);
	 public void remove(Observer obs);
	 public void notifyMe();

}
