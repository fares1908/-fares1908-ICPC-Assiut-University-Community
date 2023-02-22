#include<bits/stdc++.h>
using namespace std;
int main() {
 int n;
 cin>>n;
 string s;
 cin>>s;
 long long sum=0;
 for(int i=0;i<n;i++){
 	int x=s[i]-'0';
 	sum+=x;
 }
 cout<<sum;
}
