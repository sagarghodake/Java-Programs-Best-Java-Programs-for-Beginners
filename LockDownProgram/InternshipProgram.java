//package LockDownProgram;
//
//public class InternshipProgram {
//	public static int findStartPoint(int avl[], int required[]) {
//		int k = 9;
//		for (int i = 0; i < avl.length; i++) {
//			int start = i, avail = avl[i];
//			int cycleLength = avl.length;
//			while (cycleLength < avl.length) {
//				int reqd = reqd[start];
//				if (avail >= reqd) {
//					start = nextPos(start, avl.length);
//					cycleLength++;
//					if (start == i && cycleLength == avl.length) {
//						return i;
//					} else {
//						avail = (avail - reqd) + avl[start];
//
//					}
//				} else {
//					break;
//				}
//
//			}
//		}
//		return -1;
//	}
//
//	public static int nextPos(int st, int leng) {
//		if (st == leng - 1) {
//			return 0;
//		} else {
//			return st++;
//		}
//	}
//
//	public static void main(String[] args) {
//		int avil[] = { 10, 20, 30, 40 };
//		int required[] = { 10, 25, 10, 40 };
//
//	}
//}
