public class Map {

    private char[][] myMap;
    private char openFloor = '.';
    private char wallTile = 'X';
    private char hero = 'H';
    


    //Constructor for the Map class that creates a map with empty tiles of size rows X cols
    public Map(int rows, int cols){
        this.myMap = new char[rows][cols];

        for (int i = 0; i<rows;i++){
            for (int j = 0; j<cols;j++){
                this.myMap[i][j] = openFloor;//Initialize the map 2d array
            }
        }

    }

    //Constructor for the Map class that creates a new Map and copies all the entries from the template map passed in as parameter
    public Map(char[][] mapTemplate){

        this.myMap = new char[mapTemplate.length][mapTemplate[0].length];
        for (int i = 0; i<mapTemplate.length;i++){
            System.arraycopy(mapTemplate[i], 0, this.myMap[i], 0, mapTemplate[i].length);
        }
    }

    //toString function returns the Map in string format, separating each line from one another
    public String toString(){
        String returnString = "";

        for (int i = 0; i<this.myMap.length;i++){
            for (int j = 0; j<this.myMap[i].length;j++){
                returnString += this.myMap[i][j];
            }
            returnString += "\n";
        }

        return returnString;
    }

    //addWalls uses for loops to set the values of all the bordering characters in the map to a wallTile/X
    public void addWalls(){

        for (int i = 0; i<this.myMap.length;i++){
            this.myMap[i][0] = wallTile;
            this.myMap[i][this.myMap[i].length-1] = wallTile;
        }

        for (int i = 1; i<this.myMap[0].length;i++){
            this.myMap[0][i] = wallTile;
            this.myMap[this.myMap.length-1][i] = wallTile;
        }
    }

    public void setTile(int row, int col, char entry){
        if (row>=0 && row<this.myMap.length){
            if (col>=0 && col<this.myMap[0].length){
                if (entry == wallTile || entry == openFloor || entry == hero){
                    //Only update the entry at a given location if all parameters passed in are correct
                    this.myMap[row][col] = entry;
                }
            }
        }
    }

}
