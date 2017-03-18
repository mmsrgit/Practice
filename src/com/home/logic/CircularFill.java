package com.home.logic;

public class CircularFill {
	
	static enum ControlFlow{
		rowForward,rowBackward,columnForward,columnBackward
	}
	
	public static void main(String[] args){
		printArrayCircular(6);
	}

	private static void printArrayCircular(final int dimension) {

		int[][] array = new int[dimension][dimension];

		int rowEnd = dimension;
		int columnEnd = dimension;

		int rowBegin = 0;
		int columnBegin = 0;

		int value = 0;
		ControlFlow cf = ControlFlow.rowForward;
		boolean isExecute = true;
		breakLoop:
		{
			while(isExecute){
				switch (cf) {
				case rowForward:
					if(value==dimension*dimension){
						break breakLoop;
					}
					for(int i=columnBegin;i<columnEnd;i++){
						array[rowBegin][i] = ++value;
					}
					rowBegin++;
					cf = ControlFlow.columnForward;
					break;

				case columnForward:
					for(int i=rowBegin;i<rowEnd;i++){
						array[i][columnEnd-1] = ++value;
					}
					columnEnd--;
					cf = ControlFlow.rowBackward;
					break;

				case rowBackward:
					if(value==dimension*dimension){
						break breakLoop;
					}
					for(int i=columnEnd-1;i>=columnBegin;i--){
						array[rowEnd-1][i] = ++value;
					}
					if(value==dimension*dimension){
						isExecute = false;
					}
					rowEnd--;
					cf = ControlFlow.columnBackward;
					break;

				case columnBackward:
					for(int i=rowEnd-1;i>=rowBegin;i--){
						array[i][columnBegin] = ++value;
					}
					columnBegin++;
					cf = ControlFlow.rowForward;
					break;

				default:
					break;
				}

			}
		}
		printArray(array);

	}
	
	private static void printArray(int[][] array){
		for(int i=0;i<array[0].length;i++){
			for(int j=0;j<array[0].length;j++){
				System.out.print(array[i][j]);
				System.out.print(" ");
			}
			System.out.println("");
			
		}
			
	}

}
