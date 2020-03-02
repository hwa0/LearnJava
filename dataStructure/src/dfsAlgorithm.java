import java.util.Scanner;


//그래프(인접행렬)클래스
class DfsGraph {
    private int nV; // 정점의 개수
    private int[][] dfsGraph; // 그래프
    private boolean[] visitArr; // 정점 방문 여부 확인 배열

    //그래프 초기화
    public DfsGraph(int nV) {
        this.nV = nV;

            /*
            put(int x, int y)에서 입력되는 정점의 값은 0 이상의 정수이나
            배열의 index는 0부터 시작이므로
            정점을 담는 인접행렬의 행과 열 size는 1을 더하여 초기화해줌
             */
        this.dfsGraph = new int[this.nV+1][this.nV+1];

        this.visitArr = new boolean[this.nV+1];
    }

    //그래프 return
    public int[][] getGraph(){
        return this.dfsGraph;
    }

    //그래프 추가(양방향)
    public void put(int x, int y){
        this.dfsGraph[x][y] = this.dfsGraph[y][x] = 1;
    }

    //그래프 추가(단방향)
    public void putSingle(int x, int y){
        this.dfsGraph[x][y] = 1;
    }

    //그래프 출력(인접행렬)
    public void printGraphToAdjArr() {
        for(int i=1; i<this.dfsGraph.length; i++){
            for (int j=1; j<this.dfsGraph[i].length; j++){
                System.out.print(" " + this.dfsGraph[i][j]);
            }
            System.out.println();
        }
    }

    //정점 방문 여부 확인 배열 초기화
    public void clearVisitArr() {
        for (int i=1; i<this.visitArr.length; i++) {
            this.visitArr[i] = false;
        }
    }

    //그래프 탐색(재귀호출)
    public void dfs(int vIdx){
        this.visitArr[vIdx] = true;
        System.out.println(vIdx + "");

        for (int i = 1; i<=this.nV; i++){
            if (dfsGraph[vIdx][i] == 1 && visitArr[i] == false) {
                dfs(i);
            }
        }
    }
}

public class dfsAlgorithm {
    public static void main(String[] args){
        int nV = 0;
        int nE = 0;

        Scanner scanner = new Scanner(System.in);
        nV = scanner.nextInt();
        nE = scanner.nextInt();

        DfsGraph dfsGraph = new DfsGraph(nV);

        /*
        양방향으로 그래프 추
         */
        dfsGraph.put(1, 2);
        dfsGraph.put(1, 3);
        dfsGraph.put(2, 4);
        dfsGraph.put(2, 5);
        dfsGraph.put(3, 6);
        dfsGraph.put(3, 7);
        dfsGraph.put(4, 8);
        dfsGraph.put(5, 8);
        dfsGraph.put(6, 8);
        dfsGraph.put(7, 8);

        scanner.close();

        dfsGraph.printGraphToAdjArr();

        System.out.println();
        System.out.print("정점 1부터 탐색:");
        dfsGraph.dfs(1);

        System.out.println();
        System.out.print("정점 3부터 탐색 : ");
        dfsGraph.clearVisitArr();
        dfsGraph.dfs(3);
    }
}
