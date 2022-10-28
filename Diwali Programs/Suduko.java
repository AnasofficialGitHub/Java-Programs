import java.util.Scanner;
public class Suduko{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the rows");
		int m = scan.nextInt();
		int i,j;
		String str[][] = new String[m][m];
		for(i=0;i<m;i++){
			for(j=0;j<m;j++){
				str[i][j]=scan.next( );
			}
		}
		for(i=0;i<m;i++){
			for(j=0;j<m;j++){
				if(str[i][j].charAt(0)>=49 && str[i][j].charAt(0)<=57){
					str[i][j]=str[i][j]+",";
				}
			}
		}
		for(i=0;i<m;i++){
			for(j=0;j<m;j++){
				if(str[i][j].charAt(0)=='.') {
					find(str,i,j,m);
				}
			}
		}
		for(i=0;i<m;i++){
			for(j=0;j<m;j++){
				if(str[i][j].length()==1) {
					str[i][j]=str[i][j]+",";
				}
			}
		}
		for(i=0;i<m;i++){
			for(j=0;j<m;j++){
				System.out.print(str[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void find(String s[][],int i, int j,int m){
		int flag,flag1,flag2=2,a,b,k,l,x,y,z;
		String temp;
		for(k=1,l=49;k<=m && l<=57;k++,l++){
			flag=0;
			for(a=0;a<m;a++){
				for(b=0;b<m;b++){
					if(a==i || b==j){
						if(s[a][b].charAt(0)==l){
							flag=1;
							//break;
						}
					}
				}
			}
			if(flag==0){
				if(
				s[i][j]=Integer.toString(k);
				break;
			}
			else if(k==m && flag == 1){
				for(x=1,y=49;x<=m && y<=57;x++,y++){
					flag1=0;
					for(z=0;z<m;z++){
						if(s[i][z].charAt(0)==y)
							flag1=1;
					}
					if(flag1==0){
						s[i][j]=Integer.toString(x);
						break;
					}
				}
				for(z=0;z<m;z++){
					if(s[i][z].length()==1 && z!=j){
						flag1=0;
						for(x=0;x<m;x++){
							if(s[x][z].charAt(0)==s[i][j].charAt(0) && i!=x)
								flag1=1;
						}
						if(flag1==0){
							flag2=0;
							for(x=0;x<m;x++){
								if(s[x][j].charAt(0)==s[i][z].charAt(0) && i!=x)
									flag2=1;
							}
							if(flag2==0){
								temp=s[i][j];
								s[i][j]=s[i][z];
								s[i][z]=temp;
								break;
							}
						}
					}
				}
				if(flag2==0)
					break;
			}	
		}	
	}
}
