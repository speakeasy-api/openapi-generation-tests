"""Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT."""


def record_test(test_id: str):
    with open("test-python-record.txt", "a", -1, "utf-8") as f:
        f.write(test_id + "\n")
