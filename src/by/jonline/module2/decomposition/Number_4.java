package by.jonline.module2.decomposition;

/*На плоскости заданы своими координатами n точек. Написать метод (методы), определяющие, 
между какими из пар точек самое большое расстояние. Указание: координаты точек занести в массив*/

public class Number_4 {
	public static void main(String[] args) {

		double[][] coordinates = { { 2.0, 3.0 }, { -4.3, 1.0 }, { 5.0, 4.0 }, { 2.0, -2.8 }, { 5.0, 3.0 },
				{ -1.0, 4.4 } };

		int[] positions = distance(coordinates);

		double[] coordinate1 = coordinates[positions[0]];
		double[] coordinate2 = coordinates[positions[1]];

		double x1 = coordinate1[0];
		double x2 = coordinate2[0];

		double y1 = coordinate1[1];
		double y2 = coordinate2[1];

		System.out.println("Наибольшая дистанция между точками с координатами (" + x1 + "," + y1 + ") и (" + x2 + ","
				+ y2 + "). Дистанция между ними равна: " + lengthCalc(coordinate1, coordinate2));

	}

	public static int[] distance(double[][] a) { // определение позиций координат в массиве, наиболее удаленных друг от друга

		double length;
		double max = -Double.MAX_VALUE;

		int position1 = 0;
		int position2 = 0;

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {

				length = lengthCalc(a[i], a[j]);

				if (length > max) {

					max = length;

					position1 = i;
					position2 = j;
				}
			}
		}

		int[] positions = { position1, position2 };

		return positions;

	}

	public static double lengthCalc(double[] a, double[] b) { // определение расстояния между двумя координатами

		double x1 = a[0];
		double x2 = b[0];

		double y1 = a[1];
		double y2 = b[1];

		double length;

		length = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

		return length;
	}

}
