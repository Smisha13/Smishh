int totalWeight = 0;
		int initWeight = input2;
		
		for (int i = 0; i < input1; i++) {
			for (int j = 0; j <= i; j++) {
				totalWeight += initWeight;
				System.out.println("initWeight: " + initWeight);
			}
			
			initWeight += input3;
		}
		
		return totalWeight;
	}
