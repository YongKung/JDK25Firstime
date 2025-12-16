flowchart TD
    A([Start]) --> B[แสดงข้อความ Findmax3]
    B --> C[กำหนดค่า a = 1005, b = 555, c = 1200]
    C --> D{a > b ?}
    D -- Yes --> E[max = a]
    D -- No --> F[max = b]
    E --> G{max < c ?}
    F --> G
    G -- Yes --> H[max = c]
    G -- No --> I[max ไม่เปลี่ยน]
    H --> J[แสดงผล Max : max]
    I --> J
    J --> K([End])
