class Node:
    def __init__(self, value):
        self.value = value
        self.next = None


class LinkedList:
    def __init__(self):
        self.head = None

    def push_at_head(self, value):
        node = Node(value)
        node.next = self.head
        self.head = node

    @staticmethod
    def add_lists(list1, list2):
        carry = 0
        result = ""

        while list1 is not None or list2 is not None:
            if list1:
                value1 = list1.value
            else:
                value1 = 0

            if list2:
                value2 = list2.value
            else:
                value2 = 0

            sum_value = value1 + value2 + carry

            if sum_value >= 10:
                carry = sum_value / 10
                result += str(sum_value % 10)
            else:
                result += str(sum_value)
                carry = 0


            if list1 is not None:
                list1 = list1.next

            if list2 is not None:
                list2 = list2.next

        if carry > 0:
            result += str(carry)
        print result[::-1]
        return result[::-1]


class BigInt:
    def __init__(self, v):
        self.v = v

    def add(self, other):
        num1 = self.v
        num2 = other.v
        list1 = LinkedList()
        list2 = LinkedList()

        for i in range(0, len(num1)):
            list1.push_at_head(int(num1[i]))

        for i in range(0, len(num2)):
            list2.push_at_head(int(num2[i]))

        result = LinkedList.add_lists(list1.head, list2.head)

        return BigInt(result)


if __name__ == '__main__':
    a = BigInt("99567866897980999866757437878935298459028490583458834785246786572674617524751547157461982428197478741097904239085904359843758975438979853477459")
    b = BigInt("1565674354243245768988709487646754654765747674620423894839758975834676576247238974872857357878736785674687636874647834752399873777345657834675476467462")
    c = a.add(b)
