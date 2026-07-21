DECLARE
    CURSOR customer_cursor IS
        SELECT CustomerID, Age
        FROM Customers;

BEGIN
    FOR cust IN customer_cursor LOOP

        IF cust.Age > 60 THEN
            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = cust.CustomerID;
        END IF;

    END LOOP;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('Interest rate discount applied successfully.');

END;
/