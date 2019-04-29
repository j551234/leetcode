class Solution {
	
	public class ListNode {
		    int val;
		    ListNode next;
		    ListNode(int x) { val = x; }
	 }
	
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null){return l2;}
        if(l2==null){return l1;}
        int temp=0;
        ListNode starter = new ListNode(0); //新串列節點
         ListNode p= starter;   //p 指向頭這個節點
         while(l1!=null||l2!=null||temp!=0)
           {
               if(l1!=null){
                   temp = temp + l1.val;
                   l1=l1.next;
                   
               }
               if(l2!=null){
                   temp=temp + l2.val;
                   l2=l2.next;
               }
              p.next=new ListNode(temp%10);     //目前節點位置%10後結果位數
               p=p.next;
                temp=temp/10;    //進位
               
             }
        return starter.next;   //開始後面才為結果串列
        
        
       
        
    }
}