package Practice1;

class SeniorPassenger extends BusTicket{
		private double discount = 0.5;
		
		@Override
		public double getFare() {
			return super.getFare()*(1 - discount);	
		}
		@Override
		 public String getColor() {
	        return "Grey"; // Seniors have a different color
		}
	
}
