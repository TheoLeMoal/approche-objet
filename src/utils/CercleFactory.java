package utils;

import entites.Cercle;

public class CercleFactory {
		public static Cercle facory(double rayon) {
			return new Cercle(rayon);
		}
}
