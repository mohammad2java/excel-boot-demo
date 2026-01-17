# 📘 API Testing & Excel Size Observations

## 🔍 API Testing

All APIs can be tested using **Postman**.
Please refer to the `postman.http` file for ready-to-use request definitions and examples.

---

## 📊 Excel File Size Observations

> **Important:** The following observations are based on Excel sheets containing **~200 columns with mixed data types** (strings, numbers, dates, etc.).

### Approximate File Sizes

| Number of Rows | Approx. File Size |
| -------------: | ----------------: |
|          1,000 |           ~1.5 MB |
|         10,000 |            ~15 MB |
|        100,000 |           ~150 MB |
|      1,000,000 |           ~1.5 GB |

### ⚠️ Notes

* File size grows **almost linearly** with the number of rows.
* Large Excel files (100k+ rows) may cause:

     * High memory usage
     * Slower processing
     * Upload or timeout issues in APIs
* For very large datasets, consider:

     * Splitting files into smaller chunks
     * Using CSV instead of XLSX
     * Streaming-based processing approaches

---

