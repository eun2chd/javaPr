package _03_array;

import java.lang.reflect.Array;
import java.util.Arrays;

// 표준 배열

// 배열
// 배열에 저장할 자료형 선언하고, 배열 이름과 크기를 선언해야함
// 배열의 원소는 모두 같은 타입
// 처음 선언한 배열 크기 변경 불가능(단, ArrayList 컬렉션의 경우 동적으로 크기 조절 가능)

public class ArrayEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 변수 선언
		// 두가지 방법이 있으나 관례적으로 첫 번째 방법 사용
		// 1. 타입[] 변수:
		// 2. 타입 변수[] :
		int[] arr1;
		int arr2[];
		
		// 배열의 변수는 참조 변수 배열도 객체이므로 힙 영역에 생성되고, 배열 변수는 힙 영역의 배열 주소를 저장한다.
		// 따라서 참조할 배열이 없다면 null 로 초기화가 가능하다.
		// -> 배열 변수가 null 값을 가진 상태에서 변수[인덱스] 로 값을 읽거나 저장하게 되면 NullPointerExecption 발생
		String[] temp = null;
//		System.out.println(temp); // null
//		temp[0] //error
//		System.out.println(temp[0]);
		
		// - 값 목록으로 배열 변수 선언과 배열 생성
		int[] intArray = {16,22,34,41,59};
		System.out.println(intArray[0]);
		System.out.println(intArray[1]);
		System.out.println("intArray : " + intArray);
		// 주의 중괄호로 감싼 목록을 배열 변수에 대입할 때, 배열 변수 미리 선언한 수에는 값 목록을 대입 불가
		char[] charArr;
//		charArr = {'A','B','C'}; // error
		charArr = new char[] {'A','B','C'}; // 배열 변수 선언 시점과 값 목록 대입 시점이 다르면 new 타입[]을 목록 앞에 붙여야함
		System.out.println(charArr[0]);
		
		// -new 연산자로 배열 선언과 배열 생성
		// -new 연산자로 배열 처음 생성하면 배열 항목은 기본값으로 초기화 됨(int : 0, dobule 0.0)
		double[] doubleArray = new double[] {'A','B'};
		System.out.println("new  연산자로 초기화 된 값 : " + doubleArray[1]);
				
		// 배열 길이 : length
		// length 필드는 읽기만 가능 , 값 변경 불가능
		// 배열 길이는 반복문에서 많이 사용
		// 배열 길이를 벗어나면? ArrayIndexOutOfBoundsException
		
		System.out.println("intArray : " + Arrays.toString(intArray));		
		System.out.println("charArray  :" + Arrays.toString(charArr));		
				
		
		// 다차원 배열
		// - 배열 안에 또 다른 배열이 존재하는 배열
		// 2x3 배열 생성 및 초기화
		int[][] matrix = {{1,2,3} , {4,5,6}};
		
		
	
		
		// 3x2 배열 생성 및 초기화
		int[][] matrix2 = new int[3][2];
		matrix2[0][0] = 1;
		matrix2[0][1] = 2;
		matrix2[1][0] = 3;
		matrix2[1][1] = 4;
		matrix2[2][0] = 5;
		matrix2[2][1] = 6;
		
		for(int i = 0; i < matrix.length;i++) {
			for(int j = 0; j < matrix[i].length;j++) {
				System.out.println(matrix[i][j]);
			}
			System.out.println();
		}
		
		int[][][] threeArray = {
			    {
			        {1, 2}, {3, 4}
			    },
			    {
			        {5, 6}, {7, 8}
			    }
			};
		
	
		
		String[] langs = new String[3];
		langs[0] = "java";
		langs[1] = "java";
		langs[2] = new String("java");
		
		System.out.println(langs[0] == langs[1]); // true : 같은 객체를 참조하고있음
		System.out.println(langs[1] == langs[2]); // false : 다른 객체 참조
		System.out.println(langs[0].equals(langs[2]));
		
		
		// 배열 복사
		// - 배열은 크기가 고정되어 있다.
		// -> 더 많은 저장 공간이 필요하다면 더 큰 길이의 배열으 새로 만들어 기존 배열을 복사해야함
		// 반복문으로 요소 하나씩 복사
		int[] originArr = {1,2,3};
		int[] newArr = new int[5];
		System.out.println(Arrays.toString(originArr));
		
		for (int i = 0; i < originArr.length; i++) {
			newArr[i] = originArr[i];
		}
		
		System.out.println(Arrays.toString(newArr));
		
		// arraycopy() 사용
		// systemm.arraycopy(Object src, int srcPos,0)
		System.arraycopy(originArr, 0, newArr, 0, 0);
		
		// - 원본배열 , 원본 배열 복사 시작 인덱스,새 배열, 새 배열 붙여넣기 시작 인덱스, 복사 항목 수
		String[] originFruits = {"apple","banana","kiwi"};
		String[] newFruits = new String[5];
		
	    System.arraycopy(originFruits, 1, newFruits, 1, originFruits.length-1);
	    System.out.println(Arrays.toString(originFruits));
	    System.out.println(Arrays.toString(newFruits));
	    
	    // arrays 메소드
	    // copyOf(arr, copyArrayLength)
	    int[] originArray = {1,2,3,4,5};
	    int[] copyiedArray = Arrays.copyOf(originArray, 3);
	    System.out.println("Origin : " + Arrays.toString(originArr));
	    System.out.println("Copy : " + Arrays.toString(copyiedArray));
	    
		// copyOfRange(arr, sIdx, eIdx)
	    int[] rangeArray = Arrays.copyOfRange(originArray, 1, 3);
	    System.out.println("Range : " + Arrays.toString(rangeArray));
	    
	    // fill(arr,n) : n 값으로 배열 채워서 초기화
	    int[] filledArray = new int[5];
	    System.out.println("Filled (befor) : " + Arrays.toString(filledArray) );
	    Arrays.fill(filledArray, 7);
	    System.out.println("Filled (After) : " + Arrays.toString(filledArray));
	    
	    // sort(arr) : 정렬
	    int[] unSortedArray = {5,3,1,4,2};
	    Arrays.sort(unSortedArray);
	    System.out.println("Sorted : " + Arrays.toString(unSortedArray));
	    
	    // equals(arr1, arr2)
	    int[] array1 = {1,2,3};
	    int[] array2 = {1,2,3};
	    int[] array3 = {4,2,3};
	    
	    boolean arraysEqual1 = Arrays.equals(array1, array2);
	    boolean arraysEqual2 = Arrays.equals(array1, array3);
	    
	    System.out.println("Equals 1 vs 2 : " + arraysEqual1); // true
	    System.out.println("Equals 1 vs 3 : " + arraysEqual2); // false

	    
	    System.out.println("Equals 1 vs 3 : " + (array1==array2)); // false
	    System.out.println("Equals 1 vs 3 : " + (array1==array3)); // false
	    
	    // deepEquals(arr1,arr2)
	    int[][] deepArray1 = { {1,2}, {3,4} };
	    int[][] deepArray2 = { {1,2}, {3,4} };
	    int[][] deepArray3 = { {1,2}, {3,5} };
	    
	    
	    boolean deepArraysEqual1 = Arrays.deepEquals(deepArray1, deepArray2);
	    boolean deepArraysEqual2 = Arrays.deepEquals(deepArray1, deepArray3);
	    
	    System.out.println("deepEquals 1 vs 2 : " + deepArraysEqual1); // true
	    System.out.println("deepEquals 1 vs 3 : " + deepArraysEqual2); // false
	    
	    // binarySearch (arr, val) : 정렬된 배열일 때 사용이 가능
	    int[] sortedArray = {10,30,50,70,90};
	    int index = Arrays.binarySearch(sortedArray, 50);
	    System.out.println("Index of 50 : " + index);
	    
	    

	}

}
