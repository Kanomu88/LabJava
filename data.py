class Task:
    def __init__(self, name):
        self.name = name
        self.next = None
        self.prev = None

class TaskScheduler:
    def __init__(self):
        self.head = None

    def add_high_priority(self, name):
        new_task = Task(name)
        if not self.head:
            self.head = new_task
            self.head.next = self.head
            self.head.prev = self.head
        else:
            tail = self.head.prev
            new_task.next = self.head
            new_task.prev = tail
            tail.next = new_task
            self.head.prev = new_task
            self.head = new_task

    def add_low_priority(self, name):
        new_task = Task(name)
        if not self.head:
            self.head = new_task
            self.head.next = self.head
            self.head.prev = self.head
        else:
            tail = self.head.prev
            tail.next = new_task
            new_task.prev = tail
            new_task.next = self.head
            self.head.prev = new_task

    def remove_task(self, name):
        if not self.head:
            return
        
        current = self.head
        while True:
            if current.name == name:
                if current.next == current:
                    self.head = None
                else:
                    current.prev.next = current.next
                    current.next.prev = current.prev
                    if current == self.head:
                        self.head = current.next
                return
            current = current.next
            if current == self.head:
                break

    def print_tasks_forward(self):
        if not self.head:
            print("No tasks in the scheduler.")
            return
        current = self.head
        while True:
            print(current.name, end=' -> ')
            current = current.next
            if current == self.head:
                break
        print("(back to start)")

    def print_tasks_backward(self):
        if not self.head:
            print("No tasks in the scheduler.")
            return
        current = self.head.prev
        while True:
            print(current.name, end=' -> ')
            current = current.prev
            if current == self.head.prev:
                break
        print("(back to start)")

# ทดสอบระบบ
scheduler = TaskScheduler()
scheduler.add_high_priority("Task A")
scheduler.add_low_priority("Task B")
scheduler.add_high_priority("Task C")
scheduler.add_low_priority("Task D")
scheduler.add_low_priority("Task E")

print("Tasks in execution order (forward):")
scheduler.print_tasks_forward()
print("Tasks in execution order (backward):")
scheduler.print_tasks_backward()

# ลบงานที่เสร็จแล้ว
scheduler.remove_task("Task C")
print("After removing 'Task C':")
scheduler.print_tasks_forward()
