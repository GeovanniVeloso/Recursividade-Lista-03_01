package controller;

public class RecursivaInteiros {
		public RecursivaInteiros() {
			super();
		}
		
		public int rint (int n) {
			if (n < 10) {
				return 1;
			}else {
				return 1 + rint (n/10);
			}
		}
}
