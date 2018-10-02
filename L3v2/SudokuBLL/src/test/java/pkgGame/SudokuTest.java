package pkgGame;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class SudokuTest {
/*
	@Test
	public void Sudoku_Test1() {

		try {
			Sudoku s1 = new Sudoku(9);
		} catch (Exception e) {
			fail("Test failed to build a Sudoku");
		}

	}

	@Test(expected = Exception.class)
	public void Sudoku_Test2() throws Exception {

		Sudoku s1 = new Sudoku(10);

	}

	@Test
	public void getRegion_Test1() {

		int[][] puzzle = { { 1, 2, 3, 4 }, { 3, 4, 1, 2 }, { 2, 1, 4, 3 }, { 4, 3, 2, 1 } };
		int[] ExpectedRegion = { 3, 4, 1, 2 };

		//
		// 1 2 3 4
		// 3 4 1 2
		// 2 1 4 3
		// 4 3 2 1
		//
		// region 0 = 1 2 3 4
		// region 1 = 3 4 1 2

		int[] region;
		try {
			Sudoku s1 = new Sudoku(puzzle);

			region = s1.getRegion(1);
			System.out.println(Arrays.toString(region));			
			assertTrue(Arrays.equals(ExpectedRegion, region));

		} catch (Exception e) {
			fail("Test failed to build a Sudoku");
		}

	}
	
	@Test
	public void getRegion_Test2() {

		int[][] puzzle = { { 1, 2, 3, 4 }, { 3, 4, 1, 2 }, { 2, 1, 4, 3 }, { 4, 3, 2, 1 } };
		int[] ExpectedRegion = { 2, 1, 4, 3 };

		//
		// 1 2 3 4
		// 3 4 1 2
		// 2 1 4 3
		// 4 3 2 1
		//
		// region at 0,2 = 2 1 4 3

		int[] region;
		try {
			Sudoku s1 = new Sudoku(puzzle);

			region = s1.getRegion(0,2);
			System.out.println(Arrays.toString(region));			
			assertTrue(Arrays.equals(ExpectedRegion, region));

		} catch (Exception e) {
			fail("Test failed to build a Sudoku");
		}

	}
	
	@Test
	public void Sudoku_test1()
	{
		int[][] puzzle = { { 5, 3, 4, 6, 7, 8, 9, 1, 2 }, { 6, 7, 2, 1, 9, 5, 3, 4, 8 }, { 1, 9, 8, 3, 4, 2, 5, 6, 7 },
		{ 8, 5, 9, 7, 6, 1, 4, 2, 3 }, { 4, 2, 6, 8, 5, 3, 7, 9, 1 }, { 7, 1, 3, 9, 2, 4, 8, 5, 6 },
		{ 9, 6, 1, 5, 3, 7, 2, 8, 4 }, { 2, 8, 7, 4, 1, 9, 6, 3, 5 }, { 3, 4, 5, 2, 8, 6, 1, 7, 9 } };

		try {
			Sudoku s1 = new Sudoku(puzzle);
			assertTrue(s1.isSudoku());

		} catch (Exception e) {
			fail("Test failed to build a Sudoku");
		}
		
	}
	
	@Test
	public void Sudoku_test2()
	{
		int[][] puzzle = { { 5, 5, 5, 6, 7, 8, 9, 1, 2 }, { 6, 7, 2, 1, 9, 5, 3, 4, 8 }, { 1, 9, 8, 3, 4, 2, 5, 6, 7 },
		{ 8, 5, 9, 7, 6, 1, 4, 2, 3 }, { 4, 2, 6, 8, 5, 3, 7, 9, 1 }, { 7, 1, 3, 9, 2, 4, 8, 5, 6 },
		{ 9, 6, 1, 5, 3, 7, 2, 8, 4 }, { 2, 8, 7, 4, 1, 9, 6, 3, 5 }, { 3, 4, 5, 2, 8, 6, 1, 7, 9 } };

		try {
			Sudoku s1 = new Sudoku(puzzle);
			assertFalse(s1.isSudoku());

		} catch (Exception e) {
			fail("Test failed to build a Sudoku");
		}
		
	}
	
	@Test
	public void Sudoku_test3()
	{
		int[][] puzzle = { 
				{ 5, 3, 4, 6, 7, 8, 9, 1, 2 }, 
				{ 5, 7, 2, 1, 9, 5, 3, 4, 8 }, 
				{ 5, 9, 8, 3, 4, 2, 5, 6, 7 },
				{ 8, 5, 9, 7, 6, 1, 4, 2, 3 }, 
				{ 4, 2, 6, 8, 5, 3, 7, 9, 1 }, 
				{ 7, 1, 3, 9, 2, 4, 8, 5, 6 },
				{ 9, 6, 1, 5, 3, 7, 2, 8, 4 }, 
				{ 2, 8, 7, 4, 1, 9, 6, 3, 5 }, 
				{ 3, 4, 5, 2, 8, 6, 1, 7, 9 } };

		try {
			Sudoku s1 = new Sudoku(puzzle);
			assertFalse(s1.isSudoku());

		} catch (Exception e) {
			fail("Test failed to build a Sudoku");
		}
		
	}
	
	@Test
	public void Sudoku_test4()
	{
		int[][] puzzle = { 
				{ 55, 3, 4, 6, 7, 8, 9, 1, 2 }, 
				{ 6, 7, 2, 1, 9, 5, 3, 4, 8 }, 
				{ 1, 9, 8, 3, 4, 2, 5, 6, 7 },
				{ 8, 5, 9, 7, 6, 1, 4, 2, 3 }, 
				{ 4, 2, 6, 8, 5, 3, 7, 9, 1 }, 
				{ 7, 1, 3, 9, 2, 4, 8, 5, 6 },
				{ 9, 6, 1, 5, 3, 7, 2, 8, 4 }, 
				{ 2, 8, 7, 4, 1, 9, 6, 3, 5 }, 
				{ 3, 4, 5, 2, 8, 6, 1, 7, 9 } };

		try {
			Sudoku s1 = new Sudoku(puzzle);
			assertFalse(s1.isSudoku());

		} catch (Exception e) {
			fail("Test failed to build a Sudoku");
		}
		
	}	
	
	@Test
	public void PartialSudoku_Test1()
	{
		//	This test will test a partial sudoku...  a zero in [0,0]...  everything else works
		//	but the first element in the puzzle is zero 
		
		int[][] puzzle = { { 0, 3, 4, 6, 7, 8, 9, 1, 2 }, { 6, 7, 2, 1, 9, 5, 3, 4, 8 }, { 1, 9, 8, 3, 4, 2, 5, 6, 7 },
		{ 8, 5, 9, 7, 6, 1, 4, 2, 3 }, { 4, 2, 6, 8, 5, 3, 7, 9, 1 }, { 7, 1, 3, 9, 2, 4, 8, 5, 6 },
		{ 9, 6, 1, 5, 3, 7, 2, 8, 4 }, { 2, 8, 7, 4, 1, 9, 6, 3, 5 }, { 3, 4, 5, 2, 8, 6, 1, 7, 9 } };

		try {
			Sudoku s1 = new Sudoku(puzzle);
			assertTrue(s1.isPartialSudoku());

		} catch (Exception e) {
			fail("Test failed to build a Sudoku");
		}
		
	}
	
	@Test
	public void PartialSudoku_Test2()
	{
		//	This test will test a partial sudoku...  
		//	Everything zero, but there's a duplciate value in the region (not row/column)
 
		
		int[][] puzzle = {
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 1, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 } };

		try {
			Sudoku s1 = new Sudoku(puzzle);
			assertFalse(s1.isPartialSudoku());

		} catch (Exception e) {
			fail("Test failed to build a Sudoku");
		}
	}
	
	@Test
	public void PartialSudoku_Test3()
	{
		//	This is a working solution, make sure it fails isPartiaSudoku()
		
		int[][] puzzle = { { 5, 3, 4, 6, 7, 8, 9, 1, 2 }, { 6, 7, 2, 1, 9, 5, 3, 4, 8 }, { 1, 9, 8, 3, 4, 2, 5, 6, 7 },
		{ 8, 5, 9, 7, 6, 1, 4, 2, 3 }, { 4, 2, 6, 8, 5, 3, 7, 9, 1 }, { 7, 1, 3, 9, 2, 4, 8, 5, 6 },
		{ 9, 6, 1, 5, 3, 7, 2, 8, 4 }, { 2, 8, 7, 4, 1, 9, 6, 3, 5 }, { 3, 4, 5, 2, 8, 6, 1, 7, 9 } };

		try {
			Sudoku s1 = new Sudoku(puzzle);
			assertFalse(s1.isPartialSudoku());

		} catch (Exception e) {
			fail("Test failed to build a Sudoku");
		}
		
	}	*/

	@Test
	public void TestRegionNbr()
	{
		Sudoku s1= null;
		
		int[][] puzzle = { 
				{ 5, 3, 4, 6, 7, 8, 9, 1, 2 }, 
				{ 6, 7, 2, 1, 9, 5, 3, 4, 8 }, 
				{ 1, 9, 8, 3, 4, 2, 5, 6, 7 },
				{ 8, 5, 9, 7, 6, 1, 4, 2, 3 }, 
				{ 4, 2, 6, 8, 5, 3, 7, 9, 1 }, 
				{ 7, 1, 3, 9, 2, 4, 8, 5, 6 },
				{ 9, 6, 1, 5, 3, 7, 2, 8, 4 }, 
				{ 2, 8, 7, 4, 1, 9, 6, 3, 5 }, 
				{ 3, 4, 5, 2, 8, 6, 1, 7, 9 } };
		
		int [] Region5 = {4,2,3,7,9,1,8,5,6};
		
		try {
			 s1 = new Sudoku(puzzle);
		} catch (Exception e) {
			fail("Bad Sudoku");
		}
		
		assertTrue(Arrays.equals(Region5, s1.getRegion(5)));
		
	}
	
	 @Test

     public void FillDiagonalRegionTest() throws Exception {

            int [][] sudoku1= {{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0}};

            int [][] sudoku2= {{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0}};

            Sudoku s1 = new Sudoku(sudoku1);

            s1.FillDiagonalRegion();

            assertFalse(Arrays.equals(s1.getPuzzle(),sudoku2));

     }

    

     @Test

     public void getPuzzleTest() throws Exception {

            int[][] sudo= {{5,3,4,6,7,2,1,9,8},{6,7,8,1,9,5,3,4,2},{9,1,2,3,4,8,5,6,7},{8,5,9,4,2,6,7,1,3},{7,6,1,8,5,3,9,2,4},{4,2,3,7,9,1,8,5,6},{9,6,1,2,8,7,3,4,5},{5,3,7,4,1,9,2,8,6},{2,8,4,6,3,5,1,7,9}};

            Sudoku square= new Sudoku(sudo);

            int[][] array1= {{5,3,4,6,7,2,1,9,8},{6,7,8,1,9,5,3,4,2},{9,1,2,3,4,8,5,6,7},{8,5,9,4,2,6,7,1,3},{7,6,1,8,5,3,9,2,4},{4,2,3,7,9,1,8,5,6},{9,6,1,2,8,7,3,4,5},{5,3,7,4,1,9,2,8,6},{2,8,4,6,3,5,1,7,9}};

            int[][] array2= square.getPuzzle();

            assertTrue(Arrays.deepEquals(array1,array2));

     }

           

     @Test

     public void getRegionTest() throws Exception {

            int[][] sudo={{5,3,4,6,7,2,1,9,8},{6,7,8,1,9,5,3,4,2},{9,1,2,3,4,8,5,6,7},{8,5,9,4,2,6,7,1,3},{7,6,1,8,5,3,9,2,4},{4,2,3,7,9,1,8,5,6},{9,6,1,2,8,7,3,4,5},{5,3,7,4,1,9,2,8,6},{2,8,4,6,3,5,1,7,9}};

            Sudoku sudPuzz = new Sudoku(sudo);

            int[] region1={6,7,8,1,9,5,3,4,2};

            int region=1;

            int[] regionTest1= sudPuzz.getRegion(region);

            assertTrue(Arrays.equals(region1,regionTest1));

     }

     @Test

     public void getRegionTest1() throws Exception {

            int[][] sudo={{5,3,4,6,7,2,1,9,8},{6,7,8,1,9,5,3,4,2},{9,1,2,3,4,8,5,6,7},{8,5,9,4,2,6,7,1,3},{7,6,1,8,5,3,9,2,4},{4,2,3,7,9,1,8,5,6},{9,6,1,2,8,7,3,4,5},{5,3,7,4,1,9,2,8,6},{2,8,4,6,3,5,1,7,9}};

            Sudoku sudPuzz = new Sudoku(sudo);

            int[] region1={5,3,4,6,7,2,1,9,8};

            int region=0;

            int[] regionTest1= sudPuzz.getRegion(region);

            assertTrue(Arrays.equals(region1,regionTest1));

     }

    

     @Test

     public void getRegionTest2() throws Exception {

            int[][] sudo={{5,3,4,6,7,2,1,9,8},{6,7,8,1,9,5,3,4,2},{9,1,2,3,4,8,5,6,7},{8,5,9,4,2,6,7,1,3},{7,6,1,8,5,3,9,2,4},{4,2,3,7,9,1,8,5,6},{9,6,1,2,8,7,3,4,5},{5,3,7,4,1,9,2,8,6},{2,8,4,6,3,5,1,7,9}};

            Sudoku sudPuzz = new Sudoku(sudo);

            int[] region1={2,8,4,6,3,5,1,7,9};

            int region=8;

            int[] regionTest1= sudPuzz.getRegion(region);

            assertTrue(Arrays.equals(region1,regionTest1));

     }

    

    

     @Test

     public void getRegionTest() throws Exception {

            int[][] sudo={{5,3,4,6,7,2,1,9,8},{6,7,8,1,9,5,3,4,2},{9,1,2,3,4,8,5,6,7},{8,5,9,4,2,6,7,1,3},{7,6,1,8,5,3,9,2,4},{4,2,3,7,9,1,8,5,6},{9,6,1,2,8,7,3,4,5},{5,3,7,4,1,9,2,8,6},{2,8,4,6,3,5,1,7,9}};

            Sudoku sudPuzz = new Sudoku(sudo);

            int[] region1={6,7,8,1,9,5,3,4,2};

            int region=1;

            int[] regionTest1= sudPuzz.getRegion(region);

            assertTrue(Arrays.equals(region1,regionTest1));

     }

    

     @Test

     public void getRegionTest() throws Exception {

            int[][] sudo={{5,3,4,6,7,2,1,9,8},{6,7,8,1,9,5,3,4,2},{9,1,2,3,4,8,5,6,7},{8,5,9,4,2,6,7,1,3},{7,6,1,8,5,3,9,2,4},{4,2,3,7,9,1,8,5,6},{9,6,1,2,8,7,3,4,5},{5,3,7,4,1,9,2,8,6},{2,8,4,6,3,5,1,7,9}};

            Sudoku sudPuzz = new Sudoku(sudo);

            int[] region1={6,7,8,1,9,5,3,4,2};

            int region=2;

            int[] regionTest1= sudPuzz.getRegion(region);

            assertFalse(Arrays.equals(region1,regionTest1));

     }

    

     @Test

     public void getRegionTest() throws Exception {

            int[][] sudo={{5,3,4,6,7,2,1,9,8},{6,7,8,1,9,5,3,4,2},{9,1,2,3,4,8,5,6,7},{8,5,9,4,2,6,7,1,3},{7,6,1,8,5,3,9,2,4},{4,2,3,7,9,1,8,5,6},{9,6,1,2,8,7,3,4,5},{5,3,7,4,1,9,2,8,6},{2,8,4,6,3,5,1,7,9}};

            Sudoku sudPuzz = new Sudoku(sudo);

            int[] region1={6,7,8,1,9,5,3,4,2};

            int region=7;

            int[] regionTest1= sudPuzz.getRegion(region);

            assertFalse(Arrays.equals(region1,regionTest1));

     }

     @Test

     public void getRegionNbrTest1() throws Exception {

            int[][] sudoku1={{5,3,4,6,7,2,1,9,8},{6,7,8,1,9,5,3,4,2},{9,1,2,3,4,8,5,6,7},{8,5,9,4,2,6,7,1,3},{7,6,1,8,5,3,9,2,4},{4,2,3,7,9,1,8,5,6},{9,6,1,2,8,7,3,4,5},{5,3,7,4,1,9,2,8,6},{2,8,4,6,3,5,1,7,9}};

            Sudoku s1=new Sudoku(sudoku1);

            int region1=0;

            int iCol= 0;

            int iRow=0;

            assertTrue(Arrays.equals(region1,s1.getRegionNbr(iCol,iRow);

     }

    

     @Test

     public void isSudokuTest() throws Exception {

            int[][] sudo={{5,3,4,6,7,2,1,9,8},{6,7,8,1,9,5,3,4,2},{9,1,2,3,4,8,5,6,7},{8,5,9,4,2,6,7,1,3},{7,6,1,8,5,3,9,2,4},{4,2,3,7,9,1,8,5,6},{9,6,1,2,8,7,3,4,5},{5,3,7,4,1,9,2,8,6},{2,8,4,6,3,5,1,7,9}};

            Sudoku s= new Sudoku(sudo);

            assertTrue(s.isSudoku());

     }

    

     @Test

     public void isSudokuTest() throws Exception {

            int[][] sudo={{5,0,4,6,7,2,1,9,8},{6,7,8,1,9,5,3,4,2},{9,1,2,3,4,8,5,6,7},{8,5,9,4,2,6,7,1,3},{7,6,1,8,5,3,9,2,4},{4,2,3,7,9,1,8,5,6},{9,6,1,2,8,7,3,4,5},{5,3,7,4,1,9,2,8,6},{2,8,4,6,3,5,1,7,9}};

            Sudoku s= new Sudoku(sudo);

            assertFalse(s.isSudoku());

     }

    

     @Test

     public void isSudokuTest() throws Exception {

            int[][] sudo={{5,5,4,6,7,2,1,9,8},{6,7,8,1,9,5,3,4,2},{9,1,2,3,4,8,5,6,7},{8,5,9,4,2,6,7,1,3},{7,6,1,8,5,3,9,2,4},{4,2,3,7,9,1,8,5,6},{9,6,1,2,8,7,3,4,5},{5,3,7,4,1,9,2,8,6},{2,8,4,6,3,5,1,7,9}};

            Sudoku s= new Sudoku(sudo);

            assertFalse(s.isSudoku());

     }

    

     @Test

     public void isSudokuTest() throws Exception {

            int[][] sudo={{5,10,4,6,7,2,1,9,8},{6,7,8,1,9,5,3,4,2},{9,1,2,3,4,8,5,6,7},{8,5,9,4,2,6,7,1,3},{7,6,1,8,5,3,9,2,4},{4,2,3,7,9,1,8,5,6},{9,6,1,2,8,7,3,4,5},{5,3,7,4,1,9,2,8,6},{2,8,4,6,3,5,1,7,9}};

            Sudoku s= new Sudoku(sudo);

            assertFalse(s.isSudoku());

     }

    

     @Test

     public void isPartialSudokuTest() throws Exception {

            int[][] sudok={{5,3,0,6,0,0,0,9,8},{0,7,0,1,9,5,0,0,0},{0,0,0,0,0,0,0,6,0},{8,0,0,4,0,0,7,0,0},{0,6,0,8,0,3,0,2,0},{0,0,3,0,0,1,0,0,6},{0,6,0,0,0,0,0,0,0},{0,0,0,4,1,9,0,8,0},{2,8,0,0,0,5,0,7,9}};

            Sudoku su= new Sudoku(sudok);

            assertTrue(su.isPartialSudoku());

     }

    

     @Test

     public void isPartialSudokuTest() throws Exception {

            int[][] sudok={{10,3,0,6,0,0,0,9,8},{0,7,0,1,9,5,0,0,0},{0,0,0,0,0,0,0,6,0},{8,0,0,4,0,0,7,0,0},{0,6,0,8,0,3,0,2,0},{0,0,3,0,0,1,0,0,6},{0,6,0,0,0,0,0,0,0},{0,0,0,4,1,9,0,8,0},{2,8,0,0,0,5,0,7,9}};

            Sudoku su= new Sudoku(sudok);

            assertFalse(su.isPartialSudoku());

     }

    

     @Test

     public void isPartialSudokuTest() throws Exception {

            int[][] sudok={{5,5,0,6,0,0,0,9,8},{0,7,0,1,9,5,0,0,0},{0,0,0,0,0,0,0,6,0},{8,0,0,4,0,0,7,0,0},{0,6,0,8,0,3,0,2,0},{0,0,3,0,0,1,0,0,6},{0,6,0,0,0,0,0,0,0},{0,0,0,4,1,9,0,8,0},{2,8,0,0,0,5,0,7,9}};

            Sudoku su= new Sudoku(sudok);

            assertFalse(su.isPartialSudoku());

     }

           

     @Test

     public void isValidValueTest() throws Exception {

            int[][] region1= {{1,2,3,4},{4,3,2,1},{3,1,4,2},{2,4,1,3}};

            Sudoku sudPuzz= new Sudoku(region1);

            assertTrue(sudPuzz.isValidValue(0,0,5);

     }

    

     @Test

     public void isValidValueTest1() throws Exception {

            int[][] region2={{1,2,3,4},{4,3,2,1},{3,1,4,2},{2,4,1,3}};

            Sudoku sudPuzz1= new Sudoku(region2);

            int i= sudPuzz1.getiSize();

            assertFalse(sudPuzz1.isValidValue(0,0,2);

     }

    

     @Test

     public void getRegionNbrTest11() throws Exception {

            int[][] sudoku1={{5,3,4,6,7,2,1,9,8},{6,7,8,1,9,5,3,4,2},{9,1,2,3,4,8,5,6,7},{8,5,9,4,2,6,7,1,3},{7,6,1,8,5,3,9,2,4},{4,2,3,7,9,1,8,5,6},{9,6,1,2,8,7,3,4,5},{5,3,7,4,1,9,2,8,6},{2,8,4,6,3,5,1,7,9}};

            Sudoku s1=new Sudoku(sudoku1);

            int region1=0;

            int iCol= 0;

            int iRow=0;

            assertTrue(Arrays.equals(region1,s1.getRegionNbr(iCol,iRow);

     }

    

    

     @Test

     public void PrintPuzzleTest1() throws Exception {

            int[][] sudoku1={{5,3,4,6,7,2,1,9,8},{6,7,8,1,9,5,3,4,2},{9,1,2,3,4,8,5,6,7},{8,5,9,4,2,6,7,1,3},{7,6,1,8,5,3,9,2,4},{4,2,3,7,9,1,8,5,6},{9,6,1,2,8,7,3,4,5},{5,3,7,4,1,9,2,8,6},{2,8,4,6,3,5,1,7,9}};

            Sudoku s1=new Sudoku(sudoku1);

            s1.printPuzzle();

     }

    

     @Test

     public void SetRegionTest1() throws Exception {

            int[][] sudoku1={{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0}};

            Sudoku s1= new Sudoku(sudoku1);

            s1.setRegion(0);

            int[] r1= {5,3,4,6,7,2,1,9,8};

            assertTrue(Arrays.equals(r1,s1.getRegion(0)));

     }

           

     @Test

     public void shuffleArreyTest1() throws Exception {

            int [][] sudoku1={{5,3,4,6,7,2,1,9,8},{6,7,8,1,9,5,3,4,2},{9,1,2,3,4,8,5,6,7},{8,5,9,4,2,6,7,1,3},{7,6,1,8,5,3,9,2,4},{4,2,3,7,9,1,8,5,6},{9,6,1,2,8,7,3,4,5},{5,3,7,4,1,9,2,8,6},{2,8,4,6,3,5,1,7,9}};

            Sudoku sudokuTest1= new Sudoku(sudoku1);

            int [] array0={5,3,4,6,7,2,1,9,8};

            int [] arraytest0={5,3,4,6,7,2,1,9,8};

            sudokuTest1.shuffleArrey(arraytest0);

            assertFalse(Arrays.equals(arraytest0,array0);

     }

           

     @Test

     public void shuffleRegionTest1() throws Exception{

            int[][] sudoku1={{1,2,0,0},{3,4,0,0},{0,0,0,0},{0,0,0,0}};

            Sudoku sudokuTest1= new Sudoku(sudoku1);

            int [] array0= sudoku1.getRegion(0);

            sudoku1.shuffleRegion(0);

            int [] arraytest0= sudoku1.getRegion(0);

            assertFalse(Arrays.equals(array0,arraytest0);

            }
	
	
	
	
}
