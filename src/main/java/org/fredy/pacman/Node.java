// The MIT License (MIT)
// 
// Copyright (c) 2014 Fredy Wijaya
// 
// Permission is hereby granted, free of charge, to any person obtaining a copy of
// this software and associated documentation files (the "Software"), to deal in
// the Software without restriction, including without limitation the rights to
// use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
// the Software, and to permit persons to whom the Software is furnished to do so,
// subject to the following conditions:
// 
// The above copyright notice and this permission notice shall be included in all
// copies or substantial portions of the Software.
// 
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
// FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
// COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
// IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
// CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

package org.fredy.pacman;

/**
 * @author fredy
 */
public class Node implements Comparable<Node> {
    private int column;
    private int row;
    private int parentColumn;
    private int parentRow;
    private int distance;

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getParentColumn() {
        return parentColumn;
    }

    public void setParentColumn(int parentColumn) {
        this.parentColumn = parentColumn;
    }

    public int getParentRow() {
        return parentRow;
    }

    public void setParentRow(int parentRow) {
        this.parentRow = parentRow;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    @Override
    public int compareTo(Node node) {
        if (node.getDistance() == this.getDistance()) {
            return 0;
        } else if (this.getDistance() > node.getDistance()) {
            return 1;
        } else {
            return -1;
        }

    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Node)) {
            return false;
        }
        Node node = (Node) object;
        if (this.column == node.getColumn() && this.row == node.getRow()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + this.column;
        hash = 47 * hash + this.column;
        hash = 47 * hash + this.parentColumn;
        hash = 47 * hash + this.parentRow;
        hash = 47 * hash + this.distance;
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Row=").append(getRow());
        sb.append(";").append("Column=").append(getColumn());
        return sb.toString();
    }
}
