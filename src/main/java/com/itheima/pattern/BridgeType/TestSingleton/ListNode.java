package com.itheima.pattern.BridgeType.TestSingleton;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/5/23 10:55
 */

public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) { val = x; }

        ListNode(){};

        public ListNode(int val, ListNode node1) {
            this.val=val;
            this.next=node1;
        }

}
