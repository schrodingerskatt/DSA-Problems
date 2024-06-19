# Problem Link : https://www.naukri.com/code360/problems/detect-the-first-node-of-the-loop_1112628?&interviewProblemRedirection=true

'''
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None       
'''

def firstNode(head):
    if head is None:
        return None

    slow = head
    fast = head

    while fast is not None and fast.next is not None:
        slow = slow.next
        fast = fast.next.next
        if slow == fast:
            break

    if fast is None or fast.next is None:
        return None

    slow = head
    while slow != fast:
        slow = slow.next
        fast = fast.next

    return slow