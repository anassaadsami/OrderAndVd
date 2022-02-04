package OrderAndVd;
/*
 *  this interface represent the VD and all Observers which want 
 *  to get notification when Customer makes Order and when Order is 
 *  prepared and received to Customer 
 */
 interface Observer {
	 public void update(int orderNum, String orderName);

}
