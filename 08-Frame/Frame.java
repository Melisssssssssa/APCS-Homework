public String Frame( int r, int c) {
    
    String s = "";
    s += line(c,'*') + "\n";
    for(int i = 0;i < r - 2; i ++){
    s += '*' + line(c - 2,' ') + "*\n";
	}
    s += line(c, '*');
    return s;
}
